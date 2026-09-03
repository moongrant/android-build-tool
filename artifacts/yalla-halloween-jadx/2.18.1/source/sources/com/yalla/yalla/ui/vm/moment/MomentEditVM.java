package com.yalla.yalla.ui.vm.moment;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import code.easy.contentstate.ContentState;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.MomentDetailModel;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p031OoooO.o0000O;
import p047Oooooo0.o00OO0OO;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p501o0o00o.o000OO;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b#\u0010\u000eJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/MomentEditVM;", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "", "momentId", "", "pageIndex", "dateSort", "", "getEditHistory", "_momentId", "J", "get_momentId", "()J", "set_momentId", "(J)V", "Lcode/easy/contentstate/ContentState;", "<set-?>", "momentEditHistoryState$delegate", "Lo000oOoO/o0O00OO;", "getMomentEditHistoryState", "()Lcode/easy/contentstate/ContentState;", "setMomentEditHistoryState", "(Lcode/easy/contentstate/ContentState;)V", "momentEditHistoryState", "momentId$delegate", "getMomentId", "setMomentId", "LOooooo0/o00OO0OO;", "Lcom/yalla/yalla/model/MomentDetailModel;", "momentEditHistoryModel", "LOooooo0/o00OO0OO;", "getMomentEditHistoryModel", "()LOooooo0/o00OO0OO;", "setMomentEditHistoryModel", "(LOooooo0/o00OO0OO;)V", "<init>", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MomentEditVM extends MomentVM {
    public static final int $stable = 8;
    private long _momentId;

    /* JADX INFO: renamed from: momentId$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO momentId;

    /* JADX INFO: renamed from: momentEditHistoryState$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO momentEditHistoryState = o0OOO00.OooO0Oo(ContentState.Loading);

    @NotNull
    private o00OO0OO<MomentDetailModel> momentEditHistoryModel = new o00OO0OO<>();

    public MomentEditVM(long j) {
        this._momentId = j;
        this.momentId = o0OOO00.OooO0Oo(Long.valueOf(this._momentId));
    }

    public static /* synthetic */ void getEditHistory$default(MomentEditVM momentEditVM, long j, int i, long j2, int i2, Object obj) {
        int i3 = (i2 & 2) != 0 ? 1 : i;
        if ((i2 & 4) != 0) {
            j2 = 0;
        }
        momentEditVM.getEditHistory(j, i3, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getEditHistory$lambda-2$lambda-1, reason: not valid java name */
    public static final void m494getEditHistory$lambda2$lambda1(MomentEditVM this$0, ApiResult apiResult) {
        ContentState contentState;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (apiResult.isSuccess()) {
            List list = (List) apiResult.getData();
            if (list != null) {
                this$0.momentEditHistoryModel.addAll(list);
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("getEditHistory = ");
            sbOooO0o0.append(this$0.momentEditHistoryModel.size());
            o00O00.OooO0O0(sbOooO0o0.toString());
            Collection collection = (Collection) apiResult.getData();
            contentState = collection == null || collection.isEmpty() ? ContentState.Empty : ContentState.Content;
        } else {
            contentState = ContentState.Error;
        }
        this$0.setMomentEditHistoryState(contentState);
    }

    public final void getEditHistory(long momentId, int pageIndex, long dateSort) {
        setMomentEditHistoryState(ContentState.Loading);
        if (pageIndex == 0) {
            this.momentEditHistoryModel.clear();
        }
        Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        FragmentActivity fragmentActivity = contextOooO0O0 instanceof FragmentActivity ? (FragmentActivity) contextOooO0O0 : null;
        if (fragmentActivity != null) {
            momentEditHistory(momentId, pageIndex, dateSort).observe(fragmentActivity, new o000OO(this, 7));
        }
    }

    @NotNull
    public final o00OO0OO<MomentDetailModel> getMomentEditHistoryModel() {
        return this.momentEditHistoryModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ContentState getMomentEditHistoryState() {
        return (ContentState) this.momentEditHistoryState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long getMomentId() {
        return ((Number) this.momentId.getValue()).longValue();
    }

    public final long get_momentId() {
        return this._momentId;
    }

    public final void setMomentEditHistoryModel(@NotNull o00OO0OO<MomentDetailModel> o00oo0oo) {
        Intrinsics.checkNotNullParameter(o00oo0oo, "<set-?>");
        this.momentEditHistoryModel = o00oo0oo;
    }

    public final void setMomentEditHistoryState(@NotNull ContentState contentState) {
        Intrinsics.checkNotNullParameter(contentState, "<set-?>");
        this.momentEditHistoryState.setValue(contentState);
    }

    public final void setMomentId(long j) {
        this.momentId.setValue(Long.valueOf(j));
    }

    public final void set_momentId(long j) {
        this._momentId = j;
    }
}
