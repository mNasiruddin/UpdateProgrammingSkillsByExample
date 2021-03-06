/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.UserGroupMembersRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserGroupMembers extends TableImpl<UserGroupMembersRecord> {

    private static final long serialVersionUID = 118335237;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.user_group_members</code>
     */
    public static final UserGroupMembers USER_GROUP_MEMBERS = new UserGroupMembers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserGroupMembersRecord> getRecordType() {
        return UserGroupMembersRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.user_group_members.fk_userid</code>. the FK into the user of the member of the group
     */
    public final TableField<UserGroupMembersRecord, Integer> FK_USERID = createField("fk_userid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "the FK into the user of the member of the group");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.user_group_members.fk_user_group_id</code>. the FK into the group (which is actually a User row)
     */
    public final TableField<UserGroupMembersRecord, Integer> FK_USER_GROUP_ID = createField("fk_user_group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "the FK into the group (which is actually a User row)");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.user_group_members</code> table reference
     */
    public UserGroupMembers() {
        this(DSL.name("user_group_members"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.user_group_members</code> table reference
     */
    public UserGroupMembers(String alias) {
        this(DSL.name(alias), USER_GROUP_MEMBERS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.user_group_members</code> table reference
     */
    public UserGroupMembers(Name alias) {
        this(alias, USER_GROUP_MEMBERS);
    }

    private UserGroupMembers(Name alias, Table<UserGroupMembersRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserGroupMembers(Name alias, Table<UserGroupMembersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UserGroupMembers(Table<O> child, ForeignKey<O, UserGroupMembersRecord> key) {
        super(child, key, USER_GROUP_MEMBERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER_GROUP_MEMBERS_PK_USER_GROUP_MEMBERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserGroupMembersRecord> getPrimaryKey() {
        return Keys.PK_USER_GROUP_MEMBERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserGroupMembersRecord>> getKeys() {
        return Arrays.<UniqueKey<UserGroupMembersRecord>>asList(Keys.PK_USER_GROUP_MEMBERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGroupMembers as(String alias) {
        return new UserGroupMembers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGroupMembers as(Name alias) {
        return new UserGroupMembers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserGroupMembers rename(String name) {
        return new UserGroupMembers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserGroupMembers rename(Name name) {
        return new UserGroupMembers(name, null);
    }
}
