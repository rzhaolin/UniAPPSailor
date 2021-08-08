<template>
   <view class="container">
     <p class="content">{{content}} </p>
     <view class="addrContainer">
         <p class="hint">{{companyAdrr}}</p>
         <p class="addr">{{addr}}</p>
     </view>
	 <view class="addrContainer">
	     <p class="hint">{{githubHint}}</p>
	     <p class="addr" style="text-indent: 0.8em;">{{githubAddr}}</p>
	 </view>
    </view> 
</template>
<script>
export default {
  data() {
    return {
      content: 'uni-app 是一个使用 Vue.js 开发所有前端应用的框架，开发者编写一套代码，可发布到iOS、Android、Web（响应式）、以及各种小程序（微信/支付宝/百度/头条/QQ/钉钉/淘宝）、快应用等多个平台。DCloud公司拥有800万开发者、数百万应用、12亿手机端月活用户、数千款uni-app插件、70+微信/qq群。阿里小程序工具官方内置uni-app（详见），腾讯课堂官方为uni-app录制培训课程（详见），开发者可以放心选择。uni-app在手，做啥都不愁。即使不跨端，uni-app也是更好的小程序开发框架（详见）、更好的App跨平台框架、更方便的H5开发框架。不管领导安排什么样的项目，你都可以快速交付，不需要转换开发思维、不需要更改开发习惯。',
      companyAdrr: '官网地址:',
      addr: 'https://uniapp.dcloud.io/',
      githubHint:'git地址:   ',
      githubAddr:'https://github.com/dcloudio/uni-app',
    }
  }
}
</script>

<style>
.content {
    text-indent: 2em;
    margin-top: 32px;
    line-height: 22px;
    margin-left: 16px;
    margin-right: 16px;
	margin-bottom: 16px;
    font-size: 15px;
    color: #8993A4;
}
.addrContainer {
	display: flex;
}
.hint {
    align-items: center;
    margin-left: 16px;
    margin-right: 16px;
    margin-top: auto;
    margin-bottom: auto;
}
.addr{
    font-size: 15px;
    font-family: PingFangSC-Regular, PingFang SC;
    color: #007AFF;
    margin-top: auto;
    margin-bottom: auto;
    line-height: 22px;
}
</style>
