package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.annotations.Encodable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
@AutoValue
@Encodable
public abstract class CrashlyticsReport {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Charset f19386OooO00o = Charset.forName("UTF-8");

    @Retention(RetentionPolicy.SOURCE)
    public @interface Architecture {
        public static final int ARM64 = 9;
        public static final int ARMV6 = 5;
        public static final int ARMV7 = 6;
        public static final int UNKNOWN = 7;
        public static final int X86_32 = 0;
        public static final int X86_64 = 1;
    }

    @AutoValue
    public static abstract class OooO {

        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$OooO$OooO, reason: collision with other inner class name */
        @AutoValue
        public static abstract class AbstractC0242OooO {

            /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$OooO$OooO$OooO00o */
            @AutoValue.Builder
            public static abstract class OooO00o {
            }

            @NonNull
            public abstract String OooO00o();

            public abstract int OooO0O0();

            @NonNull
            public abstract String OooO0OO();

            public abstract boolean OooO0Oo();
        }

        @AutoValue
        public static abstract class OooO00o {

            /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$OooO$OooO00o$OooO00o, reason: collision with other inner class name */
            @AutoValue
            public static abstract class AbstractC0243OooO00o {
                @NonNull
                public abstract void OooO00o();
            }

            @Nullable
            public abstract String OooO00o();

            @Nullable
            public abstract String OooO0O0();

            @Nullable
            public abstract String OooO0OO();

            @NonNull
            public abstract String OooO0Oo();

            @Nullable
            public abstract AbstractC0243OooO00o OooO0o();

            @Nullable
            public abstract String OooO0o0();

            @NonNull
            public abstract String OooO0oO();
        }

        @AutoValue.Builder
        public static abstract class OooO0O0 {
        }

        @AutoValue
        public static abstract class OooO0OO {

            @AutoValue.Builder
            public static abstract class OooO00o {
            }

            public abstract boolean OooO();

            @NonNull
            public abstract int OooO00o();

            public abstract int OooO0O0();

            public abstract long OooO0OO();

            @NonNull
            public abstract String OooO0Oo();

            @NonNull
            public abstract String OooO0o();

            @NonNull
            public abstract String OooO0o0();

            public abstract long OooO0oO();

            public abstract int OooO0oo();
        }

        @AutoValue
        public static abstract class OooO0o {

            @AutoValue
            public static abstract class OooO00o {

                /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$OooO$OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
                @AutoValue.Builder
                public static abstract class AbstractC0244OooO00o {
                }

                @AutoValue
                public static abstract class OooO0O0 {

                    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$OooO$OooO0o$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
                    @AutoValue
                    public static abstract class AbstractC0245OooO00o {

                        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$OooO$OooO0o$OooO00o$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
                        @AutoValue.Builder
                        public static abstract class AbstractC0246OooO00o {
                        }

                        @NonNull
                        public abstract long OooO00o();

                        @NonNull
                        public abstract String OooO0O0();

                        public abstract long OooO0OO();

                        @Nullable
                        @Encodable.Ignore
                        public abstract String OooO0Oo();
                    }

                    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$OooO$OooO0o$OooO00o$OooO0O0$OooO0O0, reason: collision with other inner class name */
                    @AutoValue
                    public static abstract class AbstractC0247OooO0O0 {
                        @Nullable
                        public abstract AbstractC0247OooO0O0 OooO00o();

                        @NonNull
                        public abstract p291o0O0Oo0o.o00O0O<AbstractC0248OooO0o.AbstractC0249OooO00o> OooO0O0();

                        public abstract int OooO0OO();

                        @Nullable
                        public abstract String OooO0Oo();

                        @NonNull
                        public abstract String OooO0o0();
                    }

                    @AutoValue
                    public static abstract class OooO0OO {
                        @NonNull
                        public abstract long OooO00o();

                        @NonNull
                        public abstract String OooO0O0();

                        @NonNull
                        public abstract String OooO0OO();
                    }

                    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$OooO$OooO0o$OooO00o$OooO0O0$OooO0o, reason: collision with other inner class name */
                    @AutoValue
                    public static abstract class AbstractC0248OooO0o {

                        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$OooO$OooO0o$OooO00o$OooO0O0$OooO0o$OooO00o, reason: collision with other inner class name */
                        @AutoValue
                        public static abstract class AbstractC0249OooO00o {

                            /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$OooO$OooO0o$OooO00o$OooO0O0$OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
                            @AutoValue.Builder
                            public static abstract class AbstractC0250OooO00o {
                            }

                            @Nullable
                            public abstract String OooO00o();

                            public abstract int OooO0O0();

                            public abstract long OooO0OO();

                            public abstract long OooO0Oo();

                            @NonNull
                            public abstract String OooO0o0();
                        }

                        @NonNull
                        public abstract p291o0O0Oo0o.o00O0O<AbstractC0249OooO00o> OooO00o();

                        public abstract int OooO0O0();

                        @NonNull
                        public abstract String OooO0OO();
                    }

                    @Nullable
                    public abstract OooO00o OooO00o();

                    @NonNull
                    public abstract p291o0O0Oo0o.o00O0O<AbstractC0245OooO00o> OooO0O0();

                    @Nullable
                    public abstract AbstractC0247OooO0O0 OooO0OO();

                    @NonNull
                    public abstract OooO0OO OooO0Oo();

                    @Nullable
                    public abstract p291o0O0Oo0o.o00O0O<AbstractC0248OooO0o> OooO0o0();
                }

                @Nullable
                public abstract Boolean OooO00o();

                @Nullable
                public abstract p291o0O0Oo0o.o00O0O<OooO0OO> OooO0O0();

                @NonNull
                public abstract OooO0O0 OooO0OO();

                @Nullable
                public abstract p291o0O0Oo0o.o00O0O<OooO0OO> OooO0Oo();

                @NonNull
                public abstract Oooo000.OooO00o OooO0o();

                public abstract int OooO0o0();
            }

            @AutoValue.Builder
            public static abstract class OooO0O0 {
            }

            @AutoValue
            public static abstract class OooO0OO {

                @AutoValue.Builder
                public static abstract class OooO00o {
                }

                @Nullable
                public abstract Double OooO00o();

                public abstract int OooO0O0();

                public abstract long OooO0OO();

                public abstract int OooO0Oo();

                public abstract boolean OooO0o();

                public abstract long OooO0o0();
            }

            /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$OooO$OooO0o$OooO0o, reason: collision with other inner class name */
            @AutoValue
            public static abstract class AbstractC0251OooO0o {
                @NonNull
                public abstract String OooO00o();
            }

            @NonNull
            public abstract OooO00o OooO00o();

            @NonNull
            public abstract OooO0OO OooO0O0();

            @Nullable
            public abstract AbstractC0251OooO0o OooO0OO();

            public abstract long OooO0Oo();

            @NonNull
            public abstract String OooO0o0();
        }

        @AutoValue
        public static abstract class OooOO0 {
            @NonNull
            public abstract String OooO00o();
        }

        public abstract long OooO();

        @NonNull
        public abstract OooO00o OooO00o();

        @Nullable
        public abstract OooO0OO OooO0O0();

        @Nullable
        public abstract Long OooO0OO();

        @Nullable
        public abstract p291o0O0Oo0o.o00O0O<OooO0o> OooO0Oo();

        public abstract int OooO0o();

        @NonNull
        public abstract String OooO0o0();

        @NonNull
        @Encodable.Ignore
        public abstract String OooO0oO();

        @Nullable
        public abstract AbstractC0242OooO OooO0oo();

        @Nullable
        public abstract OooOO0 OooOO0();

        public abstract boolean OooOO0O();

        @NonNull
        public abstract OooOOO0.OooO00o OooOO0o();
    }

    @AutoValue
    public static abstract class OooO00o {

        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$OooO00o$OooO00o, reason: collision with other inner class name */
        @AutoValue
        public static abstract class AbstractC0252OooO00o {
            @NonNull
            public abstract String OooO00o();

            @NonNull
            public abstract String OooO0O0();

            @NonNull
            public abstract String OooO0OO();
        }

        @AutoValue.Builder
        public static abstract class OooO0O0 {
        }

        @Nullable
        public abstract String OooO();

        @Nullable
        public abstract p291o0O0Oo0o.o00O0O<AbstractC0252OooO00o> OooO00o();

        @NonNull
        public abstract int OooO0O0();

        @NonNull
        public abstract int OooO0OO();

        @NonNull
        public abstract String OooO0Oo();

        @NonNull
        public abstract int OooO0o();

        @NonNull
        public abstract long OooO0o0();

        @NonNull
        public abstract long OooO0oO();

        @NonNull
        public abstract long OooO0oo();
    }

    @AutoValue.Builder
    public static abstract class OooO0O0 {
    }

    @AutoValue
    public static abstract class OooO0OO {
        @NonNull
        public abstract String OooO00o();

        @NonNull
        public abstract String OooO0O0();
    }

    @AutoValue
    public static abstract class OooO0o {

        @AutoValue
        public static abstract class OooO00o {
            @NonNull
            public abstract byte[] OooO00o();

            @NonNull
            public abstract String OooO0O0();
        }

        @NonNull
        public abstract p291o0O0Oo0o.o00O0O<OooO00o> OooO00o();

        @Nullable
        public abstract String OooO0O0();
    }

    public enum Type {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    @Nullable
    public abstract OooO OooO();

    @Nullable
    public abstract OooO00o OooO00o();

    @NonNull
    public abstract String OooO0O0();

    @NonNull
    public abstract String OooO0OO();

    @NonNull
    public abstract String OooO0Oo();

    @Nullable
    public abstract OooO0o OooO0o();

    @NonNull
    public abstract String OooO0o0();

    public abstract int OooO0oO();

    @NonNull
    public abstract String OooO0oo();

    @NonNull
    public final com.google.firebase.crashlytics.internal.model.OooO0O0 OooOO0(long j, @Nullable String str, boolean z) {
        com.google.firebase.crashlytics.internal.model.OooO0O0 oooO0O0 = (com.google.firebase.crashlytics.internal.model.OooO0O0) this;
        com.google.firebase.crashlytics.internal.model.OooO0O0.OooO00o oooO00o = new com.google.firebase.crashlytics.internal.model.OooO0O0.OooO00o(oooO0O0);
        OooO oooO = oooO0O0.f19521OooO0oo;
        if (oooO != null) {
            OooOOO0.OooO00o oooO00oOooOO0o = oooO.OooOO0o();
            oooO00oOooOO0o.f19579OooO0Oo = Long.valueOf(j);
            oooO00oOooOO0o.f19581OooO0o0 = Boolean.valueOf(z);
            if (str != null) {
                oooO00oOooOO0o.f19582OooO0oO = new o0OOO0o(str);
            }
            oooO00o.f19530OooO0oO = oooO00oOooOO0o.OooO00o();
        }
        return oooO00o.OooO00o();
    }
}
