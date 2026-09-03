package io.opentelemetry.sdk.trace;

import io.opentelemetry.api.common.AttributeType;
import io.opentelemetry.api.common.OooO0o;
import io.opentelemetry.api.internal.InternalAttributeKeyImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class SemanticAttributes {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final InternalAttributeKeyImpl f32987OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final InternalAttributeKeyImpl f32988OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final InternalAttributeKeyImpl f32989OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final InternalAttributeKeyImpl f32990OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final InternalAttributeKeyImpl f32991OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final InternalAttributeKeyImpl f32992OooO0o0;

    public static final class DbCassandraConsistencyLevelValues {
        private DbCassandraConsistencyLevelValues() {
        }
    }

    public static final class DbSystemValues {
        private DbSystemValues() {
        }
    }

    public static final class FaasDocumentOperationValues {
        private FaasDocumentOperationValues() {
        }
    }

    public static final class FaasInvokedProviderValues {
        private FaasInvokedProviderValues() {
        }
    }

    public static final class FaasTriggerValues {
        private FaasTriggerValues() {
        }
    }

    public static final class HttpFlavorValues {
        private HttpFlavorValues() {
        }
    }

    public static final class MessagingDestinationKindValues {
        private MessagingDestinationKindValues() {
        }
    }

    public static final class MessagingOperationValues {
        private MessagingOperationValues() {
        }
    }

    public static final class NetHostConnectionSubtypeValues {
        private NetHostConnectionSubtypeValues() {
        }
    }

    public static final class NetHostConnectionTypeValues {
        private NetHostConnectionTypeValues() {
        }
    }

    public static final class NetTransportValues {
        private NetTransportValues() {
        }
    }

    public static final class RpcGrpcStatusCodeValues {
        private RpcGrpcStatusCodeValues() {
        }
    }

    static {
        OooO0o.OooO0o0("aws.lambda.invoked_arn");
        OooO0o.OooO0o0("db.system");
        OooO0o.OooO0o0("db.connection_string");
        OooO0o.OooO0o0("db.user");
        OooO0o.OooO0o0("db.jdbc.driver_classname");
        OooO0o.OooO0o0("db.name");
        OooO0o.OooO0o0("db.statement");
        OooO0o.OooO0o0("db.operation");
        OooO0o.OooO0o0("db.mssql.instance_name");
        OooO0o.OooO0o0("db.cassandra.keyspace");
        OooO0o.OooO0O0("db.cassandra.page_size");
        OooO0o.OooO0o0("db.cassandra.consistency_level");
        OooO0o.OooO0o0("db.cassandra.table");
        OooO0o.OooO00o("db.cassandra.idempotence");
        OooO0o.OooO0O0("db.cassandra.speculative_execution_count");
        OooO0o.OooO0o0("db.cassandra.coordinator.id");
        OooO0o.OooO0o0("db.cassandra.coordinator.dc");
        OooO0o.OooO0o0("db.hbase.namespace");
        OooO0o.OooO0O0("db.redis.database_index");
        OooO0o.OooO0o0("db.mongodb.collection");
        OooO0o.OooO0o0("db.sql.table");
        OooO0o.OooO0o0("exception.type");
        OooO0o.OooO0o0("exception.message");
        OooO0o.OooO0o0("exception.stacktrace");
        OooO0o.OooO00o("exception.escaped");
        OooO0o.OooO0o0("faas.trigger");
        OooO0o.OooO0o0("faas.execution");
        OooO0o.OooO0o0("faas.document.collection");
        OooO0o.OooO0o0("faas.document.operation");
        OooO0o.OooO0o0("faas.document.time");
        OooO0o.OooO0o0("faas.document.name");
        OooO0o.OooO0o0("faas.time");
        OooO0o.OooO0o0("faas.cron");
        OooO0o.OooO00o("faas.coldstart");
        OooO0o.OooO0o0("faas.invoked_name");
        OooO0o.OooO0o0("faas.invoked_provider");
        OooO0o.OooO0o0("faas.invoked_region");
        OooO0o.OooO0o0("net.transport");
        OooO0o.OooO0o0("net.peer.ip");
        OooO0o.OooO0O0("net.peer.port");
        f32987OooO00o = OooO0o.OooO0o0("net.peer.name");
        OooO0o.OooO0o0("net.host.ip");
        OooO0o.OooO0O0("net.host.port");
        OooO0o.OooO0o0("net.host.name");
        OooO0o.OooO0o0("net.host.connection.type");
        OooO0o.OooO0o0("net.host.connection.subtype");
        OooO0o.OooO0o0("net.host.carrier.name");
        OooO0o.OooO0o0("net.host.carrier.mcc");
        OooO0o.OooO0o0("net.host.carrier.mnc");
        OooO0o.OooO0o0("net.host.carrier.icc");
        OooO0o.OooO0o0("peer.service");
        OooO0o.OooO0o0("enduser.id");
        OooO0o.OooO0o0("enduser.role");
        OooO0o.OooO0o0("enduser.scope");
        OooO0o.OooO0O0("thread.id");
        OooO0o.OooO0o0("thread.name");
        OooO0o.OooO0o0("code.function");
        OooO0o.OooO0o0("code.namespace");
        OooO0o.OooO0o0("code.filepath");
        OooO0o.OooO0O0("code.lineno");
        f32988OooO0O0 = OooO0o.OooO0o0("http.method");
        f32989OooO0OO = OooO0o.OooO0o0("http.url");
        f32990OooO0Oo = OooO0o.OooO0o0("http.target");
        OooO0o.OooO0o0("http.host");
        f32992OooO0o0 = OooO0o.OooO0o0("http.scheme");
        f32991OooO0o = OooO0o.OooO0O0("http.status_code");
        OooO0o.OooO0o0("http.flavor");
        OooO0o.OooO0o0("http.user_agent");
        OooO0o.OooO0O0("http.request_content_length");
        OooO0o.OooO0O0("http.request_content_length_uncompressed");
        OooO0o.OooO0O0("http.response_content_length");
        OooO0o.OooO0O0("http.response_content_length_uncompressed");
        OooO0o.OooO0o0("http.server_name");
        OooO0o.OooO0o0("http.route");
        OooO0o.OooO0o0("http.client_ip");
        OooO0o.OooO0Oo("aws.dynamodb.table_names");
        OooO0o.OooO0Oo("aws.dynamodb.consumed_capacity");
        OooO0o.OooO0o0("aws.dynamodb.item_collection_metrics");
        AttributeType attributeType = AttributeType.DOUBLE;
        new InternalAttributeKeyImpl(attributeType, "aws.dynamodb.provisioned_read_capacity");
        new InternalAttributeKeyImpl(attributeType, "aws.dynamodb.provisioned_write_capacity");
        OooO0o.OooO00o("aws.dynamodb.consistent_read");
        OooO0o.OooO0o0("aws.dynamodb.projection");
        OooO0o.OooO0O0("aws.dynamodb.limit");
        OooO0o.OooO0Oo("aws.dynamodb.attributes_to_get");
        OooO0o.OooO0o0("aws.dynamodb.index_name");
        OooO0o.OooO0o0("aws.dynamodb.select");
        OooO0o.OooO0Oo("aws.dynamodb.global_secondary_indexes");
        OooO0o.OooO0Oo("aws.dynamodb.local_secondary_indexes");
        OooO0o.OooO0o0("aws.dynamodb.exclusive_start_table");
        OooO0o.OooO0O0("aws.dynamodb.table_count");
        OooO0o.OooO00o("aws.dynamodb.scan_forward");
        OooO0o.OooO0O0("aws.dynamodb.segment");
        OooO0o.OooO0O0("aws.dynamodb.total_segments");
        OooO0o.OooO0O0("aws.dynamodb.count");
        OooO0o.OooO0O0("aws.dynamodb.scanned_count");
        OooO0o.OooO0Oo("aws.dynamodb.attribute_definitions");
        OooO0o.OooO0Oo("aws.dynamodb.global_secondary_index_updates");
        OooO0o.OooO0o0("messaging.system");
        OooO0o.OooO0o0("messaging.destination");
        OooO0o.OooO0o0("messaging.destination_kind");
        OooO0o.OooO00o("messaging.temp_destination");
        OooO0o.OooO0o0("messaging.protocol");
        OooO0o.OooO0o0("messaging.protocol_version");
        OooO0o.OooO0o0("messaging.url");
        OooO0o.OooO0o0("messaging.message_id");
        OooO0o.OooO0o0("messaging.conversation_id");
        OooO0o.OooO0O0("messaging.message_payload_size_bytes");
        OooO0o.OooO0O0("messaging.message_payload_compressed_size_bytes");
        OooO0o.OooO0o0("messaging.operation");
        OooO0o.OooO0o0("messaging.rabbitmq.routing_key");
        OooO0o.OooO0o0("messaging.kafka.message_key");
        OooO0o.OooO0o0("messaging.kafka.consumer_group");
        OooO0o.OooO0o0("messaging.kafka.client_id");
        OooO0o.OooO0O0("messaging.kafka.partition");
        OooO0o.OooO00o("messaging.kafka.tombstone");
        OooO0o.OooO0o0("rpc.system");
        OooO0o.OooO0o0("rpc.service");
        OooO0o.OooO0o0("rpc.method");
        OooO0o.OooO0O0("rpc.grpc.status_code");
        OooO0o.OooO0o0("rpc.jsonrpc.version");
        OooO0o.OooO0o0("rpc.jsonrpc.request_id");
        OooO0o.OooO0O0("rpc.jsonrpc.error_code");
        OooO0o.OooO0o0("rpc.jsonrpc.error_message");
    }

    private SemanticAttributes() {
    }
}
