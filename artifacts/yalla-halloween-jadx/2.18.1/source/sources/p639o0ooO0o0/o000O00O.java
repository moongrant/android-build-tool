package p639o0ooO0o0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.grpc.ExperimentalApi;
import io.grpc.OooO;
import io.grpc.OooO00o;
import io.grpc.OooO0O0;
import io.grpc.OooO0OO;
import io.grpc.OooOO0;
import io.grpc.OooOO0O;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;
import o0OOOO0o.OooOOOO;
import p639o0ooO0o0.o000O00O;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
@CheckReturnValue
public abstract class o000O00O<S extends o000O00O<S>> {
    private final OooO0O0 callOptions;
    private final OooO0OO channel;

    public o000O00O(OooO0OO oooO0OO) {
        this(oooO0OO, OooO0O0.f26354OooOO0);
    }

    public abstract S build(OooO0OO oooO0OO, OooO0O0 oooO0O0);

    public final OooO0O0 getCallOptions() {
        return this.callOptions;
    }

    public final OooO0OO getChannel() {
        return this.channel;
    }

    public final S withCallCredentials(OooO00o oooO00o) {
        OooO0OO oooO0OO = this.channel;
        OooO0O0 oooO0O0 = this.callOptions;
        Objects.requireNonNull(oooO0O0);
        return (S) build(oooO0OO, new OooO0O0(oooO0O0));
    }

    @Deprecated
    public final S withChannel(OooO0OO oooO0OO) {
        return (S) build(oooO0OO, this.callOptions);
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1704")
    public final S withCompression(String str) {
        OooO0OO oooO0OO = this.channel;
        OooO0O0 oooO0O0 = this.callOptions;
        Objects.requireNonNull(oooO0O0);
        OooO0O0 oooO0O1 = new OooO0O0(oooO0O0);
        oooO0O1.f26359OooO0Oo = str;
        return (S) build(oooO0OO, oooO0O1);
    }

    public final S withDeadline(@Nullable OooOO0O oooOO0O) {
        OooO0OO oooO0OO = this.channel;
        OooO0O0 oooO0O0 = this.callOptions;
        Objects.requireNonNull(oooO0O0);
        OooO0O0 oooO0O1 = new OooO0O0(oooO0O0);
        oooO0O1.f26356OooO00o = oooOO0O;
        return (S) build(oooO0OO, oooO0O1);
    }

    public final S withDeadlineAfter(long j, TimeUnit timeUnit) {
        OooO0OO oooO0OO = this.channel;
        OooO0O0 oooO0O0 = this.callOptions;
        Objects.requireNonNull(oooO0O0);
        OooOO0O.OooO00o oooO00o = OooOO0O.f26366Oooo;
        Objects.requireNonNull(timeUnit, "units");
        OooOO0O oooOO0O = new OooOO0O(timeUnit.toNanos(j));
        OooO0O0 oooO0O1 = new OooO0O0(oooO0O0);
        oooO0O1.f26356OooO00o = oooOO0O;
        return (S) build(oooO0OO, oooO0O1);
    }

    public final S withExecutor(Executor executor) {
        return (S) build(this.channel, this.callOptions.OooO00o(executor));
    }

    public final S withInterceptors(OooO... oooOArr) {
        OooO0OO oooOO1 = this.channel;
        List listAsList = Arrays.asList(oooOArr);
        OooOOOO.OooOO0(oooOO1, "channel");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            oooOO1 = new OooOO0(oooOO1, (OooO) it.next());
        }
        return (S) build(oooOO1, this.callOptions);
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/2563")
    public final S withMaxInboundMessageSize(int i) {
        OooO0OO oooO0OO = this.channel;
        OooO0O0 oooO0O0 = this.callOptions;
        Objects.requireNonNull(oooO0O0);
        OooOOOO.OooO0o(i >= 0, "invalid maxsize %s", i);
        OooO0O0 oooO0O1 = new OooO0O0(oooO0O0);
        oooO0O1.f26363OooO0oo = Integer.valueOf(i);
        return (S) build(oooO0OO, oooO0O1);
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/2563")
    public final S withMaxOutboundMessageSize(int i) {
        OooO0OO oooO0OO = this.channel;
        OooO0O0 oooO0O0 = this.callOptions;
        Objects.requireNonNull(oooO0O0);
        OooOOOO.OooO0o(i >= 0, "invalid maxsize %s", i);
        OooO0O0 oooO0O1 = new OooO0O0(oooO0O0);
        oooO0O1.f26355OooO = Integer.valueOf(i);
        return (S) build(oooO0OO, oooO0O1);
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1869")
    public final <T> S withOption(OooO0O0.OooO00o<T> oooO00o, T t) {
        OooO0OO oooO0OO = this.channel;
        OooO0O0 oooO0O0 = this.callOptions;
        Objects.requireNonNull(oooO0O0);
        OooOOOO.OooOO0(oooO00o, "key");
        OooOOOO.OooOO0(t, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        OooO0O0 oooO0O1 = new OooO0O0(oooO0O0);
        int i = 0;
        while (true) {
            Object[][] objArr = oooO0O0.f26361OooO0o0;
            if (i >= objArr.length) {
                i = -1;
                break;
            }
            if (oooO00o.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, oooO0O0.f26361OooO0o0.length + (i == -1 ? 1 : 0), 2);
        oooO0O1.f26361OooO0o0 = objArr2;
        Object[][] objArr3 = oooO0O0.f26361OooO0o0;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i == -1) {
            oooO0O1.f26361OooO0o0[oooO0O0.f26361OooO0o0.length] = new Object[]{oooO00o, t};
        } else {
            oooO0O1.f26361OooO0o0[i] = new Object[]{oooO00o, t};
        }
        return (S) build(oooO0OO, oooO0O1);
    }

    public final S withWaitForReady() {
        OooO0OO oooO0OO = this.channel;
        OooO0O0 oooO0O0 = this.callOptions;
        Objects.requireNonNull(oooO0O0);
        OooO0O0 oooO0O1 = new OooO0O0(oooO0O0);
        oooO0O1.f26362OooO0oO = Boolean.TRUE;
        return (S) build(oooO0OO, oooO0O1);
    }

    public o000O00O(OooO0OO oooO0OO, OooO0O0 oooO0O0) {
        OooOOOO.OooOO0(oooO0OO, "channel");
        this.channel = oooO0OO;
        OooOOOO.OooOO0(oooO0O0, "callOptions");
        this.callOptions = oooO0O0;
    }
}
