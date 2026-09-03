package p485o0o000Oo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.model.ApiError;
import java.io.IOException;
import java.net.UnknownHostException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import okhttp3.internal.connection.RouteException;
import org.jetbrains.annotations.NotNull;
import p516o0o0O000.o0OOO0o;
import p640o0ooO0oO.o000O0O0;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00OOOOo;
import p666o0oooO0o.oOo00o0o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOo implements o00OO00O {
    @Override // p660o0ooo0o0.o00OO00O
    @NotNull
    public final o00OOOO0 intercept(@NotNull o00OO00O.OooO00o oooO00o) {
        String message;
        String str;
        o00OOOO0 o00oooo0OooO0O0;
        Intrinsics.checkNotNullParameter(oooO00o, o000O0O0.OooO00o(-10470302129680L));
        oOo00o0o ooo00o0o = (oOo00o0o) oooO00o;
        try {
            o00oooo0OooO0O0 = ((oOo00o0o) oooO00o).OooO0O0(ooo00o0o.f51883OooO0o);
            str = null;
        } catch (UnknownHostException e) {
            message = e.getMessage();
            if (message == null) {
                message = o000O0O0.OooO00o(-10496071933456L);
            }
            str = message;
            o00oooo0OooO0O0 = null;
        } catch (IOException e2) {
            message = e2.getMessage();
            if (message == null) {
                message = o000O0O0.OooO00o(-10650690756112L);
            }
            str = message;
            o00oooo0OooO0O0 = null;
        } catch (RouteException e3) {
            message = e3.getMessage();
            if (message == null) {
                message = o000O0O0.OooO00o(-10586266246672L);
            }
            str = message;
            o00oooo0OooO0O0 = null;
        } catch (Exception e4) {
            message = e4.getMessage();
            if (message == null) {
                message = o000O0O0.OooO00o(-10702230363664L);
            }
            str = message;
            o00oooo0OooO0O0 = null;
        }
        boolean z = false;
        if (o00oooo0OooO0O0 != null && o00oooo0OooO0O0.OooO0Oo()) {
            z = true;
        }
        if (z) {
            return o00oooo0OooO0O0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(o000O0O0.OooO00o(-10745180036624L));
        sb.append(o00oooo0OooO0O0 != null ? Integer.valueOf(o00oooo0OooO0O0.f51443OoooO00) : null);
        sb.append(',');
        sb.append(str);
        String string = sb.toString();
        ApiError apiError = new ApiError(1, string);
        o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
        String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiError);
        if (strOooO0oo == null) {
            strOooO0oo = o000O0O0.OooO00o(-10770949840400L);
        } else {
            Intrinsics.checkNotNullExpressionValue(strOooO0oo, o000O0O0.OooO00o(-10775244807696L));
        }
        o00OOOOo o00oooooOooO00o = o00OOOOo.f51464Oooo0oO.OooO00o(strOooO0oo, o00OO0O0.f51401OooO0oO.OooO00o(o000O0O0.OooO00o(-10882618990096L)));
        o00OOOO0.OooO00o oooO00o2 = new o00OOOO0.OooO00o();
        oooO00o2.f51454OooO0OO = 1;
        oooO00o2.OooO0o(Protocol.HTTP_2);
        oooO00o2.f51458OooO0oO = o00oooooOooO00o;
        oooO00o2.OooO0o0(string);
        oooO00o2.OooO0oO(ooo00o0o.f51883OooO0o);
        oooO00o2.f51462OooOO0o = System.currentTimeMillis();
        return oooO00o2.OooO00o();
    }
}
