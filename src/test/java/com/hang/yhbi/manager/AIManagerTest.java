package com.hang.yhbi.manager;

import com.hang.yhbi.model.enums.AIEnum;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class AIManagerTest {

    @Resource
    private AIManager aiManager;

    @Test
    public void testDoSyncUnstableRequest() {
//        String systemMessage = "你是一个数据分析师和前端开发专家，接下来我会给与你数据分析的需求和原始数据，请按以下格式回复我：" +
//                "前端 Echarts V5 的option配置对象js代码，合理地将数据进行可视化，不要生成多余的内容,比如注释+明确的数据分析结论、越详细越好，不要生成多余的注释,代码和分析使用'---'分割"
//                ;
        String userMessage = "分析需求：\n" +
                "分析网站用户的增长情况\n" +
                "原始数据：\n" +
                "日期,用户数\n" +
                "1号,10\n" +
                "2号,20\n" +
                "3号,30";
        String result = aiManager.doSyncRequest(AIEnum.SYSTEM_MESSAGE_CHART, userMessage, null);
        result=result.replace("\\n", "").replace("\\", "");
        System.out.println(result);
    }
}
