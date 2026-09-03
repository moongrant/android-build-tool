package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.util.OooOO0;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.SessionVerbosity;
import java.util.List;
import java.util.UUID;
import p319o0O0oo0O.o000OO;
import p319o0O0oo0O.o0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f20453OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f20454OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Timer f20455OooO0o0;

    public class OooO00o implements Parcelable.Creator<PerfSession> {
        @Override // android.os.Parcelable.Creator
        public final PerfSession createFromParcel(@NonNull Parcel parcel) {
            return new PerfSession(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PerfSession[] newArray(int i) {
            return new PerfSession[i];
        }
    }

    @VisibleForTesting(otherwise = 3)
    public PerfSession(String str, com.google.firebase.perf.util.OooO00o oooO00o) {
        this.f20454OooO0o = false;
        this.f20453OooO0Oo = str;
        this.f20455OooO0o0 = new Timer();
    }

    @Nullable
    public static com.google.firebase.perf.v1.PerfSession[] OooO0O0(@NonNull List<PerfSession> list) {
        if (list.isEmpty()) {
            return null;
        }
        com.google.firebase.perf.v1.PerfSession[] perfSessionArr = new com.google.firebase.perf.v1.PerfSession[list.size()];
        com.google.firebase.perf.v1.PerfSession perfSessionOooO00o = list.get(0).OooO00o();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            com.google.firebase.perf.v1.PerfSession perfSessionOooO00o2 = list.get(i).OooO00o();
            if (z || !list.get(i).f20454OooO0o) {
                perfSessionArr[i] = perfSessionOooO00o2;
            } else {
                perfSessionArr[0] = perfSessionOooO00o2;
                perfSessionArr[i] = perfSessionOooO00o;
                z = true;
            }
        }
        if (!z) {
            perfSessionArr[0] = perfSessionOooO00o;
        }
        return perfSessionArr;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
    /* JADX WARN: Code duplicated, block: B:21:0x0092  */
    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00db  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ec  */
    public static PerfSession OooO0OO() {
        boolean z;
        o000OO o000oo2;
        OooOO0<Double> oooOO1;
        OooOO0<Double> oooOO0OooO0O0;
        double dDoubleValue;
        PerfSession perfSession = new PerfSession(UUID.randomUUID().toString().replace("-", ""), new com.google.firebase.perf.util.OooO00o());
        o0Oo0oo o0oo0ooOooO0o0 = o0Oo0oo.OooO0o0();
        if (o0oo0ooOooO0o0.OooOo0()) {
            double dRandom = Math.random();
            synchronized (o000OO.class) {
                if (o000OO.f42675OooO00o == null) {
                    o000OO.f42675OooO00o = new o000OO();
                }
                o000oo2 = o000OO.f42675OooO00o;
            }
            OooOO0<Double> OooOO1 = o0oo0ooOooO0o0.OooOO0(o000oo2);
            if (OooOO1.OooO0O0()) {
                dDoubleValue = OooOO1.OooO00o().doubleValue() / 100.0d;
                if (!o0Oo0oo.OooOo0O(dDoubleValue)) {
                    oooOO1 = o0oo0ooOooO0o0.f42681OooO00o.getDouble("fpr_vc_session_sampling_rate");
                    if (oooOO1.OooO0O0() || !o0Oo0oo.OooOo0O(oooOO1.OooO00o().doubleValue())) {
                        oooOO0OooO0O0 = o0oo0ooOooO0o0.OooO0O0(o000oo2);
                        if (!oooOO0OooO0O0.OooO0O0() && o0Oo0oo.OooOo0O(oooOO0OooO0O0.OooO00o().doubleValue())) {
                            dDoubleValue = oooOO0OooO0O0.OooO00o().doubleValue();
                        } else if (o0oo0ooOooO0o0.f42681OooO00o.isLastFetchFailed()) {
                            dDoubleValue = Double.valueOf(Double.valueOf(0.01d).doubleValue() / 1000.0d).doubleValue();
                        } else {
                            dDoubleValue = Double.valueOf(0.01d).doubleValue();
                        }
                    } else {
                        o0oo0ooOooO0o0.f42683OooO0OO.OooO0Oo("com.google.firebase.perf.SessionSamplingRate", oooOO1.OooO00o().doubleValue());
                        dDoubleValue = oooOO1.OooO00o().doubleValue();
                    }
                }
            } else {
                oooOO1 = o0oo0ooOooO0o0.f42681OooO00o.getDouble("fpr_vc_session_sampling_rate");
                if (oooOO1.OooO0O0()) {
                    oooOO0OooO0O0 = o0oo0ooOooO0o0.OooO0O0(o000oo2);
                    if (!oooOO0OooO0O0.OooO0O0()) {
                        if (o0oo0ooOooO0o0.f42681OooO00o.isLastFetchFailed()) {
                            dDoubleValue = Double.valueOf(Double.valueOf(0.01d).doubleValue() / 1000.0d).doubleValue();
                        } else {
                            dDoubleValue = Double.valueOf(0.01d).doubleValue();
                        }
                    } else if (o0oo0ooOooO0o0.f42681OooO00o.isLastFetchFailed()) {
                        dDoubleValue = Double.valueOf(Double.valueOf(0.01d).doubleValue() / 1000.0d).doubleValue();
                    } else {
                        dDoubleValue = Double.valueOf(0.01d).doubleValue();
                    }
                } else {
                    oooOO0OooO0O0 = o0oo0ooOooO0o0.OooO0O0(o000oo2);
                    if (!oooOO0OooO0O0.OooO0O0()) {
                        if (o0oo0ooOooO0o0.f42681OooO00o.isLastFetchFailed()) {
                            dDoubleValue = Double.valueOf(Double.valueOf(0.01d).doubleValue() / 1000.0d).doubleValue();
                        } else {
                            dDoubleValue = Double.valueOf(0.01d).doubleValue();
                        }
                    } else if (o0oo0ooOooO0o0.f42681OooO00o.isLastFetchFailed()) {
                        dDoubleValue = Double.valueOf(Double.valueOf(0.01d).doubleValue() / 1000.0d).doubleValue();
                    } else {
                        dDoubleValue = Double.valueOf(0.01d).doubleValue();
                    }
                }
            }
            if (dRandom < dDoubleValue) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        perfSession.f20454OooO0o = z;
        return perfSession;
    }

    public final com.google.firebase.perf.v1.PerfSession OooO00o() {
        com.google.firebase.perf.v1.PerfSession.OooO0OO oooO0OONewBuilder = com.google.firebase.perf.v1.PerfSession.newBuilder();
        oooO0OONewBuilder.OooO0Oo(this.f20453OooO0Oo);
        if (this.f20454OooO0o) {
            oooO0OONewBuilder.OooO0O0(SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS);
        }
        return oooO0OONewBuilder.build();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(this.f20453OooO0Oo);
        parcel.writeByte(this.f20454OooO0o ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f20455OooO0o0, 0);
    }

    public PerfSession(Parcel parcel) {
        this.f20454OooO0o = false;
        this.f20453OooO0Oo = parcel.readString();
        this.f20454OooO0o = parcel.readByte() != 0;
        this.f20455OooO0o0 = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
