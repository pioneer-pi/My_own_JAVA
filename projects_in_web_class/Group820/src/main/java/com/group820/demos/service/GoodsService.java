package com.group820.demos.service;

import com.group820.demos.entity.Goods;

import java.util.List;

public interface GoodsService {
    /*
    查询全部商品
     */
    public List<Goods> listGoods();

    /*
    按照商品类型查询商品
     */
    public List<Goods> listGoodsByGtype(String Gtype);

    /*
    按照商品Gid查询商品
     */
    public Goods listGoodsByGid(int Gid);

    /*
    根据商品Gid删除商品
     */
    public int deleteGoodsByGid(int Gid);

    /*
    修改商品信息
     */
    public int updateGoods(int Gid,String Gname,int Gprice,String Gtype,int Gdelete,String Gintroduce);

    /*
    增加新的商品
     */
    public int addGoods(int Gid,String Gname,int Gprice,String Gtype,String Gintroduce);

    /*
    * 实现动态查询
    *
    */
    public List<Goods> queryGoods(String Gid, String Gname, String Gtype);
}
