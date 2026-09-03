package p091o000o0O;

import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.room.TypeConverter;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import p084o000Ooo0.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O {

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f35245OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f35246OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final /* synthetic */ int[] f35247OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final /* synthetic */ int[] f35248OooO0Oo;

        static {
            int[] iArr = new int[OutOfQuotaPolicy.values().length];
            f35248OooO0Oo = iArr;
            try {
                iArr[OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35248OooO0Oo[OutOfQuotaPolicy.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[NetworkType.values().length];
            f35247OooO0OO = iArr2;
            try {
                iArr2[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35247OooO0OO[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35247OooO0OO[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35247OooO0OO[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35247OooO0OO[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[BackoffPolicy.values().length];
            f35246OooO0O0 = iArr3;
            try {
                iArr3[BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35246OooO0O0[BackoffPolicy.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[WorkInfo$State.values().length];
            f35245OooO00o = iArr4;
            try {
                iArr4[WorkInfo$State.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35245OooO00o[WorkInfo$State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35245OooO00o[WorkInfo$State.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35245OooO00o[WorkInfo$State.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35245OooO00o[WorkInfo$State.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35245OooO00o[WorkInfo$State.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005c: MOVE (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:93), block:B:34:0x005b */
    @TypeConverter
    public static OooOO0 OooO00o(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        IOException e;
        ObjectInputStream objectInputStream2;
        OooOO0 oooOO1 = new OooOO0();
        if (bArr == null) {
            return oooOO1;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream3 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    for (int i = objectInputStream.readInt(); i > 0; i--) {
                        oooOO1.f35097OooO00o.add(new OooOO0.OooO00o(objectInputStream.readBoolean(), Uri.parse(objectInputStream.readUTF())));
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                } catch (IOException e3) {
                    e = e3;
                    e.printStackTrace();
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                objectInputStream3 = objectInputStream2;
                if (objectInputStream3 != null) {
                    try {
                        objectInputStream3.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                try {
                    byteArrayInputStream.close();
                    throw th;
                } catch (IOException e6) {
                    e6.printStackTrace();
                    throw th;
                }
            }
        } catch (IOException e7) {
            objectInputStream = null;
            e = e7;
        } catch (Throwable th2) {
            th = th2;
            if (objectInputStream3 != null) {
                objectInputStream3.close();
            }
            byteArrayInputStream.close();
            throw th;
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException e8) {
            e8.printStackTrace();
        }
        return oooOO1;
    }

    @TypeConverter
    public static BackoffPolicy OooO0O0(int i) {
        if (i == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (i == 1) {
            return BackoffPolicy.LINEAR;
        }
        throw new IllegalArgumentException(OooO0OO.OooO00o.OooO00o("Could not convert ", i, " to BackoffPolicy"));
    }

    @TypeConverter
    public static NetworkType OooO0OO(int i) {
        if (i == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (i == 1) {
            return NetworkType.CONNECTED;
        }
        if (i == 2) {
            return NetworkType.UNMETERED;
        }
        if (i == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (i == 4) {
            return NetworkType.METERED;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(OooO0OO.OooO00o.OooO00o("Could not convert ", i, " to NetworkType"));
        }
        return NetworkType.TEMPORARILY_UNMETERED;
    }

    @NonNull
    @TypeConverter
    public static OutOfQuotaPolicy OooO0Oo(int i) {
        if (i == 0) {
            return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i == 1) {
            return OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException(OooO0OO.OooO00o.OooO00o("Could not convert ", i, " to OutOfQuotaPolicy"));
    }

    @TypeConverter
    public static int OooO0o(WorkInfo$State workInfo$State) {
        switch (OooO00o.f35245OooO00o[workInfo$State.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + workInfo$State + " to int");
        }
    }

    @TypeConverter
    public static WorkInfo$State OooO0o0(int i) {
        if (i == 0) {
            return WorkInfo$State.ENQUEUED;
        }
        if (i == 1) {
            return WorkInfo$State.RUNNING;
        }
        if (i == 2) {
            return WorkInfo$State.SUCCEEDED;
        }
        if (i == 3) {
            return WorkInfo$State.FAILED;
        }
        if (i == 4) {
            return WorkInfo$State.BLOCKED;
        }
        if (i == 5) {
            return WorkInfo$State.CANCELLED;
        }
        throw new IllegalArgumentException(OooO0OO.OooO00o.OooO00o("Could not convert ", i, " to State"));
    }
}
