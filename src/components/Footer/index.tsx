import { DefaultFooter } from '@ant-design/pro-components';
import React from 'react';

const Footer: React.FC = () => {
  return (
    <DefaultFooter
      style={{
        background: 'none',
      }}
      copyright={false}
      links={[
        {
          key: 'by Seacolour',
          title: 'by Seacolour',
          href: 'https://github.com/Seacolour',
          blankTarget: true,
        },
      ]}
    />
  );
};

export default Footer;
