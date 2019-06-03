package qunar.tc.qmq.backup.config;

import qunar.tc.qmq.configuration.DynamicConfig;

public class DefaultBackupConfig implements BackupConfig {
    public static final int DEFAULT_BACKUP_THREAD_SIZE = 1;
    public static final int DEFAULT_FLUSH_INTERVAL = 500;
    public static final int DEFAULT_RETRY_NUM = 5;
    public static final int DEFAULT_BATCH_SIZE = 10;
    public static final String DEFAULT_HBASE_CONFIG_FILE = "backup-hbase.properties";
    public static final String DEFAULT_HBASE_MESSAGE_INDEX_TABLE = "QMQ_BACKUP";
    public static final String DEFAULT_HBASE_DELAY_MESSAGE_INDEX_TABLE = "QMQ_BACKUP_DELAY";
    public static final String DEFAULT_HBASE_RECORD_TABLE = "QMQ_BACKUP_RECORD";
    public static final String DEFAULT_HBASE_DEAD_TABLE = "QMQ_BACKUP_DEAD";
    public static final String DEFAULT_DB_DIC_TABLE = "qmq_dic";
    public static final String DEFAULT_DELAY_DB_DIC_TABLE = "qmq_delay_dic";
    public static final String DEFAULT_STORE_FACTORY_TYPE = "hbase";
    public static final int DEFAULT_ROCKS_DB_TTL = 7200;

    public static final String SYNC_OFFSET_FLUSH_INTERVAL_CONFIG_KEY = "sync.offset.flush.interval";
    public static final String MESSAGE_BATCH_SIZE_CONFIG_KEY = "message.backup.batch.size";
    public static final String MESSAGE_RETRY_NUM_CONFIG_KEY = "message.backup.max.retry.num";
    public static final String RECORD_BATCH_SIZE_CONFIG_KEY = "record.backup.batch.size";
    public static final String RECORD_BACKUP_RETRY_NUM_CONFIG_KEY = "record.backup.max.retry.num";
    public static final String ENABLE_RECORD_CONFIG_KEY = "enable.record";
    public static final String HBASE_CONFIG_FILE_CONFIG_KEY = "hbase_config_file";
    public static final String HBASE_MESSAGE_INDEX_CONFIG_KEY = "table.qmq.backup";
    public static final String HBASE_DELAY_MESSAGE_INDEX_CONFIG_KEY = "table.qmq.delay.backup";
    public static final String HBASE_RECORD_CONFIG_KEY = "table.qmq.backup.record";
    public static final String HBASE_DEAD_CONFIG_KEY = "table.qmq.backup.dead";
    public static final String DB_DIC_TABLE_NAME_CONFIG_KEY = "db_dic_table_name";
    public static final String DELAY_DB_DIC_TABLE_NAME_CONFIG_KEY = "delay_dic_table_name";
    public static final String DEAD_MESSAGE_BACKUP_THREAD_SIZE_CONFIG_KEY = "dead.message.backup.thread.size";
    public static final String DEAD_RECORD_BACKUP_THREAD_SIZE_CONFIG_KEY = "dead.record.backup.thread.size";
    public static final String STORE_FACTORY_TYPE_CONFIG_KEY = "store.type";
    public static final String ROCKS_DB_PATH_CONFIG_KEY = "rocks.db.path";
    public static final String ROCKS_DB_TTL_CONFIG_KEY = "rocks.db.ttl";
    public static final String ACQUIRE_BACKUP_META_URL = "acquire.server.meta.url";

    private volatile String brokerGroup;

    private final DynamicConfig config;

    public DefaultBackupConfig(DynamicConfig config) {
        this.config = config;
    }

    @Override
    public String getBrokerGroup() {
        return brokerGroup;
    }

    @Override
    public void setBrokerGroup(String name) {
        this.brokerGroup = name;
    }

    @Override
    public DynamicConfig getDynamicConfig() {
        return config;
    }
}
