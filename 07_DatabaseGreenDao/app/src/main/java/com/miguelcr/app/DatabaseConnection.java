package com.miguelcr.app;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.miguelcr.app.localdb.AirlineDao;
import com.miguelcr.app.localdb.DaoMaster;
import com.miguelcr.app.localdb.DaoSession;
import com.miguelcr.app.localdb.VueloDao;


public class DatabaseConnection {
    private static SQLiteDatabase db;
    private static DaoMaster daoMaster;
    private static DaoSession daoSession;

    public static DaoSession getConnection(Context ctx) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(ctx,"aerolineas-db", null);
        db = helper.getWritableDatabase();
        daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();

        return daoSession;
    }

    public static AirlineDao getAirlineDao (Context ctx) {
        DaoSession daoSession = DatabaseConnection.getConnection(ctx);
        return daoSession.getAirlineDao();
    }

    public static VueloDao getVueloDao (Context ctx) {
        DaoSession daoSession = DatabaseConnection.getConnection(ctx);
        return daoSession.getVueloDao();
    }

}
