<header class="am-topbar am-topbar-fixed-top am-topbar-inverse" >
<#include "/common/commoncss.ftl" />
    <link rel="alternate icon" type="image/png" href="/assets/image/favicon.ico">
    <link rel="apple-touch-icon-precomposed" href="/assets/image/favicon.ico">

    <div class="am-container">
        <h1 class="am-topbar-brand">
            <a href="/index.html"><img src="/assets/image/favicon.ico"/>doukit</a>
        </h1>

        <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-secondary am-show-sm-only"
                data-am-collapse="{target: '#collapse-head'}"><span class="am-sr-only">导航切换</span> <span
                class="am-icon-bars"></span></button>

        <div class="am-collapse am-topbar-collapse" id="collapse-head">
            <ul class="am-nav am-nav-pills am-topbar-nav">
                <li class="am-active navitem index" id="index"><a href="/index.html">首页</a></li>

                <li class="navitem doukit" id="doukit"><a href="/index/about.html">关于</a></li>

                <li class="navitem am-dropdown order" id="order" data-am-dropdown>
                    <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
                        示例 <span class="am-icon-caret-down"></span>
                    </a>
                    <ul class="am-dropdown-content">
                    <#--
                    <li class="am-dropdown-header">标题</li>-->
                        <li><a href="/demo/demoa.html">示例a</a></li>
                        <li><a href="/demo/demoa.html">示例b</a></li>
                        <li><a href="/demo/demoa.html">示例c</a></li>
                    </ul>
                </li>

            </ul>

            <div class="am-topbar-right">
                <button class="am-btn am-btn-secondary am-topbar-btn am-btn-sm"><span class="am-icon-sign-out"></span>退出</button>
            </div>

        </div>
    </div>

</header>