package p596o0oo0;

import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.Conversation;
import com.yalla.yalla.common.db.table.ConversationWithUser;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import p089o000o000.o000OO;
import p089o000o000.o000OO00;
import p089o000o000.o000OOo0;
import p089o000o000.o00O0000;
import p089o000o000.o00O00o0;
import p089o000o000.o0O0ooO;
import p089o000o000.oo0oOO0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p391o0OOooOo.o0O00000;
import p490o0o00O0.OooOo00;
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO0 extends ViewModel {

    public static final class OooO00o extends Lambda implements Function0<o00O00o0<Integer, ConversationWithUser>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f47628Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O00o0<Integer, ConversationWithUser> invoke() {
            OooOo00 oooOo00OooOOoo = OooO0OO.OooO00o().OooOOoo();
            Long value = OooOOO.f41216OooO00o.OooOo().getValue();
            return oooOo00OooOOoo.OooOOOo(value == null ? 0L : value.longValue());
        }
    }

    @NotNull
    public final Flow<o0O0ooO<ConversationWithUser>> OooO0O0() {
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        OooO00o pagingSourceFactory = OooO00o.f47628Oooo0o;
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o00O0000 config = new o00O0000(20, 5, false, 0, 56);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        return p089o000o000.OooOOO.OooO00o(new o000OO(pagingSourceFactory instanceof oo0oOO0 ? new o000OO00(pagingSourceFactory) : new o000OOo0(pagingSourceFactory, null), null, config).f28877OooO0o, ViewModelKt.getViewModelScope(this));
    }

    public final void OooO0OO(@NotNull Conversation model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.getTopTime() > 0) {
            o0O00000.OooO0OO("Message_Message_UnTop");
            if (model.getTargetId() > 0) {
                OooO0Oo(model.getTargetId(), 0L);
                String strOooO0OO = o000O0O0.OooO0OO(R.string.message_list_Unpinned);
                ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                    return;
                }
                p254o00ooO0O.o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                    return;
                } else {
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                    return;
                }
            }
            return;
        }
        o0O00000.OooO0OO("Message_Message_Top");
        OooOo.OooO0O0("104008");
        OooOo00 oooOo00OooOOoo = OooO0OO.OooO00o().OooOOoo();
        Long value = OooOOO.f41216OooO00o.OooOo().getValue();
        if (oooOo00OooOOoo.OooOO0(value == null ? 0L : value.longValue()) >= 5) {
            String strOooO0OO2 = o000O0O0.OooO0OO(R.string.message_list_only_up_5);
            ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
            if (strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2)) {
                return;
            }
            p254o00ooO0O.o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O1.run();
                return;
            } else {
                o00O000 o00o002 = o00O000.f34346OooO00o;
                o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                return;
            }
        }
        if (model.getTargetId() > 0) {
            OooO0Oo(model.getTargetId(), System.currentTimeMillis());
            String strOooO0OO3 = o000O0O0.OooO0OO(R.string.message_list_Pinned);
            ToastUtil toastUtil3 = ToastUtil.f12568OooO0O0;
            if (strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3)) {
                return;
            }
            p254o00ooO0O.o0O0ooO o0o0oooOooO0O2 = p074o000O0oo.OooOOO.OooO0O0(toastUtil3, strOooO0OO3, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O2.run();
            } else {
                o00O000 o00o003 = o00O000.f34346OooO00o;
                o00O000.f34348OooO0OO.post(o0o0oooOooO0O2);
            }
        }
    }

    public final void OooO0Oo(long j, long j2) {
        OooOo00 oooOo00OooOOoo = OooO0OO.OooO00o().OooOOoo();
        Long value = OooOOO.f41216OooO00o.OooOo().getValue();
        oooOo00OooOOoo.OooOOO0(value == null ? 0L : value.longValue(), j, j2);
    }
}
