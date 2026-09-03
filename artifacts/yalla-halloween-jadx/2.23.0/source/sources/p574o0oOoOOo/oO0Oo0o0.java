package p574o0oOoOOo;

import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.Oooo0;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.data.db.table.Conversation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow;
import o000O00O.OooOOO;
import o000O00O.o000O000;
import o000O00O.o000O0o;
import o000O00O.o00O000o;
import org.jetbrains.annotations.NotNull;
import p403o0Oo0OOo.o00OOOOo;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class oO0Oo0o0 extends ViewModel {
    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO0OO(@NotNull Conversation model) {
        Intrinsics.checkNotNullParameter(model, "model");
        boolean z = true;
        if (model.getTopTime() > 0) {
            o0OO000.OooO00o("104012");
            if (model.getTargetId() > 0) {
                OooO0Oo(model.getTargetId(), 0L);
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.message_list_Unpinned);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (z) {
                    return;
                }
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                    return;
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    return;
                }
            }
            return;
        }
        o0OO000.OooO00o("104011");
        o0OO000.OooO00o("104008");
        o00OOOOo o00oooooOooOOo0 = o000OOo.OooO00o().OooOOo0();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        if (o00oooooOooOOo0.OooO0oO(l == null ? 0L : l.longValue()) >= 5) {
            String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.message_list_only_up_5);
            if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o2.run();
                return;
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                return;
            }
        }
        if (model.getTargetId() > 0) {
            OooO0Oo(model.getTargetId(), System.currentTimeMillis());
            String strOooO0OO3 = o0000.OooO0OO(oO00OOo0.message_list_Pinned);
            if (strOooO0OO3 != null && !StringsKt.isBlank(strOooO0OO3)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o3 = o000O00.OooO00o(strOooO0OO3, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o3.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO0Oo(long j, long j2) {
        o00OOOOo o00oooooOooOOo0 = o000OOo.OooO00o().OooOOo0();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        o00oooooOooOOo0.OooOOOo(l == null ? 0L : l.longValue(), j, j2);
    }

    @NotNull
    public final SharedFlow OooO0O0() {
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        oO0OO0O pagingSourceFactory = oO0OO0O.f56319OooO0Oo;
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o000O00O.o000Oo0 config = new o000O00O.o000Oo0(20, 5, false, 20);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        return OooOOO.OooO00o(new Oooo0(pagingSourceFactory instanceof o00O000o ? new o000O000(pagingSourceFactory) : new o000O0o(pagingSourceFactory, null), null, config).f7179OooO0o, viewModelScope);
    }
}
