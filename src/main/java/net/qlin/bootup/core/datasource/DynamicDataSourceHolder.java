package net.qlin.bootup.core.datasource;

import org.springframework.util.Assert;

public class DynamicDataSourceHolder {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setDataSource(String dataSource) {
        Assert.notNull(dataSource, "dataSource cannot be null");

        contextHolder.set(dataSource);
    }

    public static void setMaster() {
        setDataSource("master");
    }

    public static void setSlave() {
        setDataSource("slave");
    }

    public static String getDataSource() {
        return contextHolder.get();
    }

    /**
     * 检查当前请求是否已经绑定数据源
     *
     * @return true 已经绑定 fase 未绑定
     */
    public static boolean isBindDataSource() {
        return contextHolder.get() != null;
    }
}
