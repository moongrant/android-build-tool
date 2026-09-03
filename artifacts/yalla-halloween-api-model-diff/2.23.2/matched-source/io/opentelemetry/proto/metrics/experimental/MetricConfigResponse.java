package io.opentelemetry.proto.metrics.experimental;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class MetricConfigResponse extends GeneratedMessageLite<MetricConfigResponse, Builder> implements MetricConfigResponseOrBuilder {
    private static final MetricConfigResponse DEFAULT_INSTANCE;
    public static final int FINGERPRINT_FIELD_NUMBER = 1;
    private static volatile Parser<MetricConfigResponse> PARSER = null;
    public static final int SCHEDULES_FIELD_NUMBER = 2;
    public static final int SUGGESTED_WAIT_TIME_SEC_FIELD_NUMBER = 3;
    private ByteString fingerprint_ = ByteString.EMPTY;
    private Internal.ProtobufList<Schedule> schedules_ = GeneratedMessageLite.emptyProtobufList();
    private int suggestedWaitTimeSec_;

    /* JADX INFO: renamed from: io.opentelemetry.proto.metrics.experimental.MetricConfigResponse$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32624OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f32624OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32624OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32624OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32624OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32624OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32624OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32624OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MetricConfigResponse, Builder> implements MetricConfigResponseOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        private Builder() {
            super(MetricConfigResponse.DEFAULT_INSTANCE);
        }
    }

    public static final class Schedule extends GeneratedMessageLite<Schedule, Builder> implements ScheduleOrBuilder {
        private static final Schedule DEFAULT_INSTANCE;
        public static final int EXCLUSION_PATTERNS_FIELD_NUMBER = 1;
        public static final int INCLUSION_PATTERNS_FIELD_NUMBER = 2;
        private static volatile Parser<Schedule> PARSER = null;
        public static final int PERIOD_SEC_FIELD_NUMBER = 3;
        private Internal.ProtobufList<Pattern> exclusionPatterns_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<Pattern> inclusionPatterns_ = GeneratedMessageLite.emptyProtobufList();
        private int periodSec_;

        public static final class Builder extends GeneratedMessageLite.Builder<Schedule, Builder> implements ScheduleOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder() {
                super(Schedule.DEFAULT_INSTANCE);
            }
        }

        public static final class Pattern extends GeneratedMessageLite<Pattern, Builder> implements PatternOrBuilder {
            private static final Pattern DEFAULT_INSTANCE;
            public static final int EQUALS_FIELD_NUMBER = 1;
            private static volatile Parser<Pattern> PARSER = null;
            public static final int STARTS_WITH_FIELD_NUMBER = 2;
            private int matchCase_ = 0;
            private Object match_;

            public static final class Builder extends GeneratedMessageLite.Builder<Pattern, Builder> implements PatternOrBuilder {
                public /* synthetic */ Builder(int i) {
                    this();
                }

                private Builder() {
                    super(Pattern.DEFAULT_INSTANCE);
                }
            }

            public enum MatchCase {
                EQUALS(1),
                STARTS_WITH(2),
                MATCH_NOT_SET(0);

                private final int value;

                MatchCase(int i) {
                    this.value = i;
                }
            }

            static {
                Pattern pattern = new Pattern();
                DEFAULT_INSTANCE = pattern;
                GeneratedMessageLite.registerDefaultInstance(Pattern.class, pattern);
            }

            private Pattern() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEquals() {
                if (this.matchCase_ == 1) {
                    this.matchCase_ = 0;
                    this.match_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMatch() {
                this.matchCase_ = 0;
                this.match_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStartsWith() {
                if (this.matchCase_ == 2) {
                    this.matchCase_ = 0;
                    this.match_ = null;
                }
            }

            public static Pattern getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Pattern parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Pattern) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Pattern parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Pattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Pattern> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEquals(String str) {
                str.getClass();
                this.matchCase_ = 1;
                this.match_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEqualsBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.match_ = byteString.toStringUtf8();
                this.matchCase_ = 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStartsWith(String str) {
                str.getClass();
                this.matchCase_ = 2;
                this.match_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStartsWithBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.match_ = byteString.toStringUtf8();
                this.matchCase_ = 2;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                int i = 0;
                switch (AnonymousClass1.f32624OooO00o[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Pattern();
                    case 2:
                        return new Builder(i);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000", new Object[]{"match_", "matchCase_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Pattern> defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            synchronized (Pattern.class) {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                                break;
                            }
                        }
                        return defaultInstanceBasedParser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public String getEquals() {
                return this.matchCase_ == 1 ? (String) this.match_ : "";
            }

            public ByteString getEqualsBytes() {
                return ByteString.copyFromUtf8(this.matchCase_ == 1 ? (String) this.match_ : "");
            }

            public MatchCase getMatchCase() {
                int i = this.matchCase_;
                if (i == 0) {
                    return MatchCase.MATCH_NOT_SET;
                }
                if (i == 1) {
                    return MatchCase.EQUALS;
                }
                if (i != 2) {
                    return null;
                }
                return MatchCase.STARTS_WITH;
            }

            public String getStartsWith() {
                return this.matchCase_ == 2 ? (String) this.match_ : "";
            }

            public ByteString getStartsWithBytes() {
                return ByteString.copyFromUtf8(this.matchCase_ == 2 ? (String) this.match_ : "");
            }

            public static Builder newBuilder(Pattern pattern) {
                return DEFAULT_INSTANCE.createBuilder(pattern);
            }

            public static Pattern parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Pattern) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Pattern parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Pattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Pattern parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Pattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Pattern parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Pattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Pattern parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Pattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Pattern parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Pattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Pattern parseFrom(InputStream inputStream) throws IOException {
                return (Pattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Pattern parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Pattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Pattern parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Pattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Pattern parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Pattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public interface PatternOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            Schedule schedule = new Schedule();
            DEFAULT_INSTANCE = schedule;
            GeneratedMessageLite.registerDefaultInstance(Schedule.class, schedule);
        }

        private Schedule() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllExclusionPatterns(Iterable<? extends Pattern> iterable) {
            ensureExclusionPatternsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.exclusionPatterns_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllInclusionPatterns(Iterable<? extends Pattern> iterable) {
            ensureInclusionPatternsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.inclusionPatterns_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExclusionPatterns(Pattern pattern) {
            pattern.getClass();
            ensureExclusionPatternsIsMutable();
            this.exclusionPatterns_.add(pattern);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addInclusionPatterns(Pattern pattern) {
            pattern.getClass();
            ensureInclusionPatternsIsMutable();
            this.inclusionPatterns_.add(pattern);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExclusionPatterns() {
            this.exclusionPatterns_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInclusionPatterns() {
            this.inclusionPatterns_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPeriodSec() {
            this.periodSec_ = 0;
        }

        private void ensureExclusionPatternsIsMutable() {
            if (this.exclusionPatterns_.isModifiable()) {
                return;
            }
            this.exclusionPatterns_ = GeneratedMessageLite.mutableCopy(this.exclusionPatterns_);
        }

        private void ensureInclusionPatternsIsMutable() {
            if (this.inclusionPatterns_.isModifiable()) {
                return;
            }
            this.inclusionPatterns_ = GeneratedMessageLite.mutableCopy(this.inclusionPatterns_);
        }

        public static Schedule getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Schedule parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Schedule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Schedule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Schedule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Schedule> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeExclusionPatterns(int i) {
            ensureExclusionPatternsIsMutable();
            this.exclusionPatterns_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeInclusionPatterns(int i) {
            ensureInclusionPatternsIsMutable();
            this.inclusionPatterns_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExclusionPatterns(int i, Pattern pattern) {
            pattern.getClass();
            ensureExclusionPatternsIsMutable();
            this.exclusionPatterns_.set(i, pattern);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInclusionPatterns(int i, Pattern pattern) {
            pattern.getClass();
            ensureInclusionPatternsIsMutable();
            this.inclusionPatterns_.set(i, pattern);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPeriodSec(int i) {
            this.periodSec_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.f32624OooO00o[methodToInvoke.ordinal()]) {
                case 1:
                    return new Schedule();
                case 2:
                    return new Builder(i);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u0004", new Object[]{"exclusionPatterns_", Pattern.class, "inclusionPatterns_", Pattern.class, "periodSec_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Schedule> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Schedule.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public Pattern getExclusionPatterns(int i) {
            return this.exclusionPatterns_.get(i);
        }

        public int getExclusionPatternsCount() {
            return this.exclusionPatterns_.size();
        }

        public List<Pattern> getExclusionPatternsList() {
            return this.exclusionPatterns_;
        }

        public PatternOrBuilder getExclusionPatternsOrBuilder(int i) {
            return this.exclusionPatterns_.get(i);
        }

        public List<? extends PatternOrBuilder> getExclusionPatternsOrBuilderList() {
            return this.exclusionPatterns_;
        }

        public Pattern getInclusionPatterns(int i) {
            return this.inclusionPatterns_.get(i);
        }

        public int getInclusionPatternsCount() {
            return this.inclusionPatterns_.size();
        }

        public List<Pattern> getInclusionPatternsList() {
            return this.inclusionPatterns_;
        }

        public PatternOrBuilder getInclusionPatternsOrBuilder(int i) {
            return this.inclusionPatterns_.get(i);
        }

        public List<? extends PatternOrBuilder> getInclusionPatternsOrBuilderList() {
            return this.inclusionPatterns_;
        }

        public int getPeriodSec() {
            return this.periodSec_;
        }

        public static Builder newBuilder(Schedule schedule) {
            return DEFAULT_INSTANCE.createBuilder(schedule);
        }

        public static Schedule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Schedule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Schedule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Schedule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Schedule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Schedule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExclusionPatterns(int i, Pattern pattern) {
            pattern.getClass();
            ensureExclusionPatternsIsMutable();
            this.exclusionPatterns_.add(i, pattern);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addInclusionPatterns(int i, Pattern pattern) {
            pattern.getClass();
            ensureInclusionPatternsIsMutable();
            this.inclusionPatterns_.add(i, pattern);
        }

        public static Schedule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Schedule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Schedule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Schedule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Schedule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Schedule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Schedule parseFrom(InputStream inputStream) throws IOException {
            return (Schedule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Schedule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Schedule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Schedule parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Schedule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Schedule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Schedule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ScheduleOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        MetricConfigResponse metricConfigResponse = new MetricConfigResponse();
        DEFAULT_INSTANCE = metricConfigResponse;
        GeneratedMessageLite.registerDefaultInstance(MetricConfigResponse.class, metricConfigResponse);
    }

    private MetricConfigResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSchedules(Iterable<? extends Schedule> iterable) {
        ensureSchedulesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.schedules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSchedules(Schedule schedule) {
        schedule.getClass();
        ensureSchedulesIsMutable();
        this.schedules_.add(schedule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFingerprint() {
        this.fingerprint_ = getDefaultInstance().getFingerprint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchedules() {
        this.schedules_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestedWaitTimeSec() {
        this.suggestedWaitTimeSec_ = 0;
    }

    private void ensureSchedulesIsMutable() {
        if (this.schedules_.isModifiable()) {
            return;
        }
        this.schedules_ = GeneratedMessageLite.mutableCopy(this.schedules_);
    }

    public static MetricConfigResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MetricConfigResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricConfigResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricConfigResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MetricConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MetricConfigResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSchedules(int i) {
        ensureSchedulesIsMutable();
        this.schedules_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFingerprint(ByteString byteString) {
        byteString.getClass();
        this.fingerprint_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchedules(int i, Schedule schedule) {
        schedule.getClass();
        ensureSchedulesIsMutable();
        this.schedules_.set(i, schedule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestedWaitTimeSec(int i) {
        this.suggestedWaitTimeSec_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f32624OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new MetricConfigResponse();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\n\u0002\u001b\u0003\u0004", new Object[]{"fingerprint_", "schedules_", Schedule.class, "suggestedWaitTimeSec_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MetricConfigResponse> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MetricConfigResponse.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public ByteString getFingerprint() {
        return this.fingerprint_;
    }

    public Schedule getSchedules(int i) {
        return this.schedules_.get(i);
    }

    public int getSchedulesCount() {
        return this.schedules_.size();
    }

    public List<Schedule> getSchedulesList() {
        return this.schedules_;
    }

    public ScheduleOrBuilder getSchedulesOrBuilder(int i) {
        return this.schedules_.get(i);
    }

    public List<? extends ScheduleOrBuilder> getSchedulesOrBuilderList() {
        return this.schedules_;
    }

    public int getSuggestedWaitTimeSec() {
        return this.suggestedWaitTimeSec_;
    }

    public static Builder newBuilder(MetricConfigResponse metricConfigResponse) {
        return DEFAULT_INSTANCE.createBuilder(metricConfigResponse);
    }

    public static MetricConfigResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricConfigResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricConfigResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MetricConfigResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MetricConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSchedules(int i, Schedule schedule) {
        schedule.getClass();
        ensureSchedulesIsMutable();
        this.schedules_.add(i, schedule);
    }

    public static MetricConfigResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MetricConfigResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MetricConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MetricConfigResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MetricConfigResponse parseFrom(InputStream inputStream) throws IOException {
        return (MetricConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricConfigResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricConfigResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MetricConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MetricConfigResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
