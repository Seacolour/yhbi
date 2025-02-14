package com.hang.yhbi;
import com.zhipu.oapi.ClientV4;
import com.zhipu.oapi.Constants;
import com.zhipu.oapi.service.v4.model.ChatCompletionRequest;
import com.zhipu.oapi.service.v4.model.ChatMessage;
import com.zhipu.oapi.service.v4.model.ChatMessageRole;
import com.zhipu.oapi.service.v4.model.ModelApiResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@SpringBootTest
public class zhipuTest {

    @Resource
    private ClientV4 clientV4;

    String text="你是一个数据分析师和前端开发专家，接下来我会按照以下固定格式给你提供内容：\n" +
            "分析目标：\n" +
            "{数据分析的需求或者目标}\n" +
            "原始数据\n" +
            "{csv格式的原始数据，用,作为分隔符}\n" +
            "请根据以上内容，帮我生成数据分析结论和可视化图标代码?";

    @Test
    public void test() {
        //构造请求
        List<ChatMessage> messages = new ArrayList<>();
        ChatMessage chatMessage = new ChatMessage(ChatMessageRole.USER.value(), "你是谁?");
        messages.add(chatMessage);
        String requestId = String.valueOf(System.currentTimeMillis());
        ChatCompletionRequest chatCompletionRequest = ChatCompletionRequest.builder()
                .model("glm-4-flash")
                .stream(Boolean.FALSE)
                .invokeMethod(Constants.invokeMethod)
                .messages(messages)
                .requestId(requestId)
                .build();
        //调用
        ModelApiResponse invokeModelApiResp = clientV4.invokeModelApi(chatCompletionRequest);
        System.out.println("model output:" + invokeModelApiResp.getMsg());
    }
}
