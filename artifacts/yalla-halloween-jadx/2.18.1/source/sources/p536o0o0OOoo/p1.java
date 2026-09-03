package p536o0o0OOoo;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.LiveData;
import com.yalla.yalla.model.ShareActivityModel;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p501o0o00o.o0000oo;
import p563o0oOo0.o00O0000;
import p649o0ooOOoo.tb;

/* JADX INFO: loaded from: classes2.dex */
public final class p1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ tb f43835Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f43836Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f43837Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ ShareActivityModel f43838Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(ShareToFriendsActivity shareToFriendsActivity, long j, ShareActivityModel shareActivityModel, tb tbVar) {
        super(0);
        this.f43836Oooo0o = shareToFriendsActivity;
        this.f43837Oooo0oO = j;
        this.f43838Oooo0oo = shareActivityModel;
        this.f43835Oooo = tbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<Long> listMutableListOf;
        ShareToFriendsActivity activity = this.f43836Oooo0o;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        View viewFindViewById = activity.findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
        o00O0000 o00o0001 = this.f43836Oooo0o.f22218OoooooO;
        o00O0000 o00o0002 = null;
        if (o00o0001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o00o0001 = null;
        }
        if (o00o0001.f45071OooOOo0) {
            o00O0000 o00o0003 = this.f43836Oooo0o.f22218OoooooO;
            if (o00o0003 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            } else {
                o00o0002 = o00o0003;
            }
            listMutableListOf = CollectionsKt.toMutableList((Collection) o00o0002.f45070OooOOo);
        } else {
            listMutableListOf = CollectionsKt.mutableListOf(Long.valueOf(this.f43837Oooo0oO));
        }
        LiveData<Boolean> liveDataShareActivity = ShareToFriendsActivity.OooOoo(this.f43836Oooo0o).shareActivity(listMutableListOf, this.f43838Oooo0oo.getImage2(), this.f43838Oooo0oo.getText3(), this.f43838Oooo0oo.getText4(), this.f43838Oooo0oo.getUrl(), this.f43835Oooo.f50645OooO0O0.getText().toString(), this.f43838Oooo0oo.getActivity());
        ShareToFriendsActivity shareToFriendsActivity = this.f43836Oooo0o;
        liveDataShareActivity.observe(shareToFriendsActivity, new o0000oo(shareToFriendsActivity, 3));
        return Unit.INSTANCE;
    }
}
