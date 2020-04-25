/*
package com.woxing.webmagic;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

import java.util.*;

*/
/**
 * 自己的解析器
 *//*

public class JobProcessor implements PageProcessor {
*/
/**
 * WebMagic 有4个主件 Downloader（下载） PageProcessor（解析 处理） Schedule（管理） Pipeline（持久化）
 *//*



    */
/**
     *  //页面解析页面
     * @param page 解析页面 获得的·数据
     *//*

    @Override
    public void process(Page page) {
        //解析 页面 把解析的结果 放入到了resultltems  中了
        //可以有xpath  正则表达式 css 三种获取元数
        //xpath可以在网上有教程
        //css
        //page.putField("div",page.getHtml().css(".menu dl dt").all());

       // $(".menu dl dt","text") 获取 dt里的值 [女士裙装, 女士上装, 女士下装]
       // page.putField("div1",page.getHtml().css("#J_8xb2zs0xc3w div div").nodes());
       // page.putField("div",page.getHtml().$(".women-floor160419-14 div.mt a","text").all());
       // page.putField("div",page.getHtml().$(".women-floor160419-14 div.mc ul li a","text").nodes());
       // page.putField("div",page.getHtml().$(".women-floor160419-14 div.mc ul li").links().all());

        //page.putField("div1",page.getHtml().$(".menu dl dd a","text").all());
        //page.addTargetRequests(page.getHtml().css(".menu dl dd").links().all());
       // List<Selectable> nodes = page.getHtml().$(".menu dl dt","text").nodes();
        Selectable text = page.getHtml().$(".women-floor160419-14 div.mc ul li a", "text").nodes().get(1);
        System.out.println(text);
    }

    private Site site =Site.me();

    @Override
    public Site getSite() {
        return site;
    }


    public static void main(String[] args) {
        //Spider是个大的容器
       */
/* Spider.create(new JobProcessor())
                .addUrl("https://channel.jd.com/women.html") //添加页面 爬取数据
                .run();//执行 爬虫
*//*

        ArrayList<Integer> integers = new ArrayList<>();
        String str="21984356";
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            String s = String.valueOf(aChar);
            integers.add(Integer.parseInt(s));
        }
        Collections.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2)

                    return 1;

                else if(o1<o2)

                    return -1;

                else {
                    return 0;
                }
            }
        });

        System.out.println(integers);
    }
}
*/
