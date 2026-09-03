package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.android.billingclient.api.o0000Ooo;
import com.google.firebase.perf.util.OooO;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.SessionVerbosity;
import java.util.List;
import java.util.UUID;
import p309o0O0oO0.o000OOo0;
import p309o0O0oO0.o00O0OO0;

/* JADX INFO: loaded from: classes3.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f19981OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f19982OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Timer f19983OooO0o0;

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
    public PerfSession(String str, o0000Ooo o0000ooo) {
        this.f19982OooO0o = false;
        this.f19981OooO0Oo = str;
        this.f19983OooO0o0 = new Timer();
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
            if (z || !list.get(i).f19982OooO0o) {
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
        o00O0OO0 o00o0oo1;
        OooO<Double> oooO;
        OooO<Double> oooOOooO0O0;
        double dDoubleValue;
        PerfSession perfSession = new PerfSession(UUID.randomUUID().toString().replace("-", ""), new o0000Ooo());
        o000OOo0 o000ooo0OooO0o0 = o000OOo0.OooO0o0();
        if (o000ooo0OooO0o0.OooOo0()) {
            double dRandom = Math.random();
            synchronized (o00O0OO0.class) {
                if (o00O0OO0.f41805OooO00o == null) {
                    o00O0OO0.f41805OooO00o = new o00O0OO0();
                }
                o00o0oo1 = o00O0OO0.f41805OooO00o;
            }
            OooO<Double> oooOOooOO0 = o000ooo0OooO0o0.OooOO0(o00o0oo1);
            if (oooOOooOO0.OooO0O0()) {
                dDoubleValue = oooOOooOO0.OooO00o().doubleValue() / 100.0d;
                if (!o000OOo0.OooOo0O(dDoubleValue)) {
                    oooO = o000ooo0OooO0o0.f41785OooO00o.getDouble("fpr_vc_session_sampling_rate");
                    if (oooO.OooO0O0() || !o000OOo0.OooOo0O(oooO.OooO00o().doubleValue())) {
                        oooOOooO0O0 = o000ooo0OooO0o0.OooO0O0(o00o0oo1);
                        if (!oooOOooO0O0.OooO0O0() && o000OOo0.OooOo0O(oooOOooO0O0.OooO00o().doubleValue())) {
                            dDoubleValue = oooOOooO0O0.OooO00o().doubleValue();
                        } else if (o000ooo0OooO0o0.f41785OooO00o.isLastFetchFailed()) {
                            dDoubleValue = Double.valueOf(Double.valueOf(0.01d).doubleValue() / 1000.0d).doubleValue();
                        } else {
                            dDoubleValue = Double.valueOf(0.01d).doubleValue();
                        }
                    } else {
                        o000ooo0OooO0o0.f41787OooO0OO.OooO0Oo("com.google.firebase.perf.SessionSamplingRate", oooO.OooO00o().doubleValue());
                        dDoubleValue = oooO.OooO00o().doubleValue();
                    }
                }
            } else {
                oooO = o000ooo0OooO0o0.f41785OooO00o.getDouble("fpr_vc_session_sampling_rate");
                if (oooO.OooO0O0()) {
                    oooOOooO0O0 = o000ooo0OooO0o0.OooO0O0(o00o0oo1);
                    if (!oooOOooO0O0.OooO0O0()) {
                        if (o000ooo0OooO0o0.f41785OooO00o.isLastFetchFailed()) {
                            dDoubleValue = Double.valueOf(Double.valueOf(0.01d).doubleValue() / 1000.0d).doubleValue();
                        } else {
                            dDoubleValue = Double.valueOf(0.01d).doubleValue();
                        }
                    } else if (o000ooo0OooO0o0.f41785OooO00o.isLastFetchFailed()) {
                        dDoubleValue = Double.valueOf(Double.valueOf(0.01d).doubleValue() / 1000.0d).doubleValue();
                    } else {
                        dDoubleValue = Double.valueOf(0.01d).doubleValue();
                    }
                } else {
                    oooOOooO0O0 = o000ooo0OooO0o0.OooO0O0(o00o0oo1);
                    if (!oooOOooO0O0.OooO0O0()) {
                        if (o000ooo0OooO0o0.f41785OooO00o.isLastFetchFailed()) {
                            dDoubleValue = Double.valueOf(Double.valueOf(0.01d).doubleValue() / 1000.0d).doubleValue();
                        } else {
                            dDoubleValue = Double.valueOf(0.01d).doubleValue();
                        }
                    } else if (o000ooo0OooO0o0.f41785OooO00o.isLastFetchFailed()) {
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
        perfSession.f19982OooO0o = z;
        return perfSession;
    }

    public final com.google.firebase.perf.v1.PerfSession OooO00o() {
        com.google.firebase.perf.v1.PerfSession.OooO0OO oooO0OONewBuilder = com.google.firebase.perf.v1.PerfSession.newBuilder();
        oooO0OONewBuilder.OooO0Oo(this.f19981OooO0Oo);
        if (this.f19982OooO0o) {
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
        parcel.writeString(this.f19981OooO0Oo);
        parcel.writeByte(this.f19982OooO0o ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f19983OooO0o0, 0);
    }

    public PerfSession(Parcel parcel) {
        this.f19982OooO0o = false;
        this.f19981OooO0Oo = parcel.readString();
        this.f19982OooO0o = parcel.readByte() != 0;
        this.f19983OooO0o0 = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
