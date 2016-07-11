package com.example.y.mvp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.example.y.mvp.NewsTabNameInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "NEWS_TAB_NAME_INFO".
*/
public class NewsTabNameInfoDao extends AbstractDao<NewsTabNameInfo, Integer> {

    public static final String TABLENAME = "NEWS_TAB_NAME_INFO";

    /**
     * Properties of entity NewsTabNameInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Tag = new Property(0, Integer.class, "tag", true, "TAG");
        public final static Property Id = new Property(1, Integer.class, "id", false, "ID");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
    };


    public NewsTabNameInfoDao(DaoConfig config) {
        super(config);
    }
    
    public NewsTabNameInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"NEWS_TAB_NAME_INFO\" (" + //
                "\"TAG\" INTEGER PRIMARY KEY ," + // 0: tag
                "\"ID\" INTEGER," + // 1: id
                "\"NAME\" TEXT);"); // 2: name
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"NEWS_TAB_NAME_INFO\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, NewsTabNameInfo entity) {
        stmt.clearBindings();
 
        Integer tag = entity.getTag();
        if (tag != null) {
            stmt.bindLong(1, tag);
        }
 
        Integer id = entity.getId();
        if (id != null) {
            stmt.bindLong(2, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
    }

    /** @inheritdoc */
    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public NewsTabNameInfo readEntity(Cursor cursor, int offset) {
        NewsTabNameInfo entity = new NewsTabNameInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // tag
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // name
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, NewsTabNameInfo entity, int offset) {
        entity.setTag(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setId(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    /** @inheritdoc */
    @Override
    protected Integer updateKeyAfterInsert(NewsTabNameInfo entity, long rowId) {
        return entity.getTag();
    }
    
    /** @inheritdoc */
    @Override
    public Integer getKey(NewsTabNameInfo entity) {
        if(entity != null) {
            return entity.getTag();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
