package p582o0oOoo0;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.Oooo0;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.data.db.table.Conversation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import p101o000oo.o00O000;
import p101o000oo.o00O0OOO;
import p101o000oo.o00oOoo;
import p101o000oo.o0O0ooO;
import p101o000oo.o0OOO0o;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000O0O extends ViewModel {
    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO0OO(@NotNull Conversation model) {
        Intrinsics.checkNotNullParameter(model, "model");
        boolean z = true;
        if (model.getTopTime() > 0) {
            OooO00o.OooO0O0("104012");
            if (model.getTargetId() > 0) {
                OooO0Oo(model.getTargetId(), 0L);
                String strOooO0OO = o0000.OooO0OO(o000000.message_list_Unpinned);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (z) {
                    return;
                }
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                    return;
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    return;
                }
            }
            return;
        }
        OooO00o.OooO0O0("104011");
        OooO00o.OooO0O0("104008");
        p407o0Oo0Oo.o000000 o000000VarOooOOo = o00Oo0.OooO00o().OooOOo();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        if (o000000VarOooOOo.OooO0oO(l == null ? 0L : l.longValue()) >= 5) {
            String strOooO0OO2 = o0000.OooO0OO(o000000.message_list_only_up_5);
            if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(strOooO0OO2, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o2.run();
                return;
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                return;
            }
        }
        if (model.getTargetId() > 0) {
            OooO0Oo(model.getTargetId(), System.currentTimeMillis());
            String strOooO0OO3 = o0000.OooO0OO(o000000.message_list_Pinned);
            if (strOooO0OO3 != null && !StringsKt.isBlank(strOooO0OO3)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o3 = OooOo00.OooO00o(strOooO0OO3, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o3.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO0Oo(long j, long j2) {
        p407o0Oo0Oo.o000000 o000000VarOooOOo = o00Oo0.OooO00o().OooOOo();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        o000000VarOooOOo.OooOOOo(l == null ? 0L : l.longValue(), j, j2);
    }

    @NotNull
    public final SharedFlow OooO0O0() {
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        o0000O0 pagingSourceFactory = o0000O0.f56625OooO0Oo;
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o00O000 config = new o00O000(20, 5, false, 20);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        return o0OOO0o.OooO00o(new Oooo0(pagingSourceFactory instanceof o00O0OOO ? new o0O0ooO(pagingSourceFactory) : new o00oOoo(pagingSourceFactory, null), null, config).f10273OooO0o, viewModelScope);
    }
}
