package com.group820.demos.util;

public class SqlUtils {
    private SqlUtils SqlUtil;

    public static boolean validate(String input) {
        boolean flag = true;
        if ("".equals(input)) {
            flag = false;
        }
        if (null == input) {
            flag = false;
        }
        return flag;
    }

    public String subSQL(String Gid,String Gname,String Gtype) {
        String subSQL = " ";
        boolean flagGid = SqlUtil.validate(Gid);
        if (true == flagGid) {
            subSQL += " and Gid = " + Gid + " ";
        }
        boolean flagGname = SqlUtil.validate(Gname);
        if (true == flagGname) {
            subSQL += " and Gname = '" + Gname + "' ";
        }
        boolean flagGtype = SqlUtil.validate(Gtype);
        if (true == flagGtype) {
            subSQL += " and  Gtype = '" + Gtype +"' ";
        }

        return subSQL;
    }
}
