package com.group820.demos.service.impl;

import com.group820.demos.entity.Goods;
import com.group820.demos.service.GoodsService;
import com.group820.demos.util.DatabaseUtil;
import com.group820.demos.util.SqlUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GoodsServiceImpl implements GoodsService {

    @Override
    public List<Goods> listGoods() {
        List<Goods> goods = new ArrayList<>();
        String sql = "select Gid,Gname,Gprice,Gtype,Gdelete,Gintroduce from Goods";

        try(Connection connection = DatabaseUtil.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery()){
            while (resultSet.next()){
                Goods goods1 = new Goods();
                goods1.setGid(resultSet.getInt("Gid"));
                goods1.setGname(resultSet.getString("Gname"));
                goods1.setGprice(resultSet.getInt("Gprice"));
                goods1.setGtype(resultSet.getString("Gtype"));
                goods1.setGdelete(resultSet.getInt("Gdelete"));
                goods1.setGintroduce(resultSet.getString("Gintroduce"));

                goods.add(goods1);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return goods;
    }

    @Override
    public List<Goods> listGoodsByGtype(String Gtype) {
        List<Goods> goods = new ArrayList<>();
        String sql = "select Gid,Gname,Gprice,Gtype,Gdelete,Gintroduce from Goods where Gtype=?";

        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setString(1, Gtype);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Goods goods1 = new Goods();
                    goods1.setGid(resultSet.getInt("Gid"));
                    goods1.setGname(resultSet.getString("Gname"));
                    goods1.setGprice(resultSet.getInt("Gprice"));
                    goods1.setGtype(resultSet.getString("Gtype"));
                    goods1.setGdelete(resultSet.getInt("Gdelete"));
                    goods1.setGintroduce(resultSet.getString("Gintroduce"));

                    goods.add(goods1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return goods;
    }

    @Override
    public Goods listGoodsByGid(int Gid) {
        Goods goods = null;
        String sql = "select Gname,Gprice,Gtype,Gdelete,Gintroduce from Goods where Gid=? ";

        try(Connection connection = DatabaseUtil.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1,Gid);
            try(ResultSet resultSet = statement.executeQuery()){
                while (resultSet.next()) {
                    goods = new Goods();
                    goods.setGid(Gid);
                    goods.setGname(resultSet.getString("Gname"));
                    goods.setGprice(resultSet.getInt("Gprice"));
                    goods.setGtype(resultSet.getString("Gtype"));
                    goods.setGdelete(resultSet.getInt("Gdelete"));
                    goods.setGintroduce(resultSet.getString("Gintroduce"));
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return goods;
    }

    @Override
    public int deleteGoodsByGid(int Gid) {
        int flag = 0;
        String sql = "update Goods set Gdelete = 1 where Gid = ?";

        try(Connection connection = DatabaseUtil.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setInt(1,Gid);

            flag = statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public int updateGoods(int Gid,String Gname, int Gprice, String Gtype,int Gdelete,String Gintroduce) {
        int flag = 0;
        String sql = "update Goods set Gname=?,Gprice=?,Gtype=?,Gdelete=?,Gintroduce=? where Gid=?";

        try(Connection connection = DatabaseUtil.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setString(1,Gname);
            statement.setInt(2,Gprice);
            statement.setString(3,Gtype);
            statement.setInt(4, Gdelete);
            statement.setString(5,Gintroduce);
            statement.setInt(6, Gid);

            flag = statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public int addGoods(int Gid,String Gname, int Gprice, String Gtype,String Gintroduce) {
        int flag = 0;
        String sql = "insert into Goods(Gid,Gname,Gprice,Gtype,Gintroduce) values(?,?,?,?,?)";

        try(Connection connection = DatabaseUtil.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setInt(1,Gid);
            statement.setString(2,Gname);
            statement.setInt(3,Gprice);
            statement.setString(4,Gtype);
            statement.setString(5,Gintroduce);

            flag = statement.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<Goods> queryGoods(String Gid, String Gname, String Gtype) {
        List<Goods> goods = new ArrayList<>();
        SqlUtils sqlUtil = new SqlUtils();
        String sql = "SELECT Gid,Gname,Gprice,Gtype,Gdelete,Gintroduce FROM Goods where 1=1 ";
        sql += sqlUtil.subSQL(Gid,Gname, Gtype);
        try(Connection connection = DatabaseUtil.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            ){
            while (resultSet.next()){
                Goods goods1 = new Goods();
                goods1.setGid(resultSet.getInt("Gid"));
                goods1.setGname(resultSet.getString("Gname"));
                goods1.setGprice(resultSet.getInt("Gprice"));
                goods1.setGtype(resultSet.getString("Gtype"));
                goods1.setGdelete(resultSet.getInt("Gdelete"));
                goods1.setGintroduce(resultSet.getString("Gintroduce"));
                goods.add(goods1);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return goods;
    }
}
