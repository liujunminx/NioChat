package cn.sinjinsong.common.enumeration;

/**
 * 任务枚举：
 * 1 文件
 * 2 图片
 */
public enum TaskType {
    FILE(1,"文件"),
    CRAWL_IMAGE(2,"豆瓣电影图片");
    private int code;
    private String desc;

    TaskType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
}
