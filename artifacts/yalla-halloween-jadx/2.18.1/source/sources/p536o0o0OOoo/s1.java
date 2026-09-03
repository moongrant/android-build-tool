package p536o0o0OOoo;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.LiveData;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p501o0o00o.o0000OO0;
import p563o0oOo0.o00O0000;
import p649o0ooOOoo.xb;

/* JADX INFO: loaded from: classes2.dex */
public final class s1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ xb f43863Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f43864Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f43865Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ TopicInfoModel f43866Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(ShareToFriendsActivity shareToFriendsActivity, long j, TopicInfoModel topicInfoModel, xb xbVar) {
        super(0);
        this.f43864Oooo0o = shareToFriendsActivity;
        this.f43865Oooo0oO = j;
        this.f43866Oooo0oo = topicInfoModel;
        this.f43863Oooo = xbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<Long> listMutableListOf;
        ShareToFriendsActivity activity = this.f43864Oooo0o;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        View viewFindViewById = activity.findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
        o00O0000 o00o0001 = this.f43864Oooo0o.f22218OoooooO;
        o00O0000 o00o0002 = null;
        if (o00o0001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o00o0001 = null;
        }
        if (o00o0001.f45071OooOOo0) {
            o00O0000 o00o0003 = this.f43864Oooo0o.f22218OoooooO;
            if (o00o0003 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            } else {
                o00o0002 = o00o0003;
            }
            listMutableListOf = CollectionsKt.toMutableList((Collection) o00o0002.f45070OooOOo);
        } else {
            listMutableListOf = CollectionsKt.mutableListOf(Long.valueOf(this.f43865Oooo0oO));
        }
        LiveData<Boolean> liveDataShareTopic = ShareToFriendsActivity.OooOoo(this.f43864Oooo0o).shareTopic(listMutableListOf, this.f43866Oooo0oo.getId(), this.f43866Oooo0oo.getImage(), this.f43866Oooo0oo.getName(), this.f43866Oooo0oo.getJoinNum(), this.f43866Oooo0oo.getDyNum(), this.f43863Oooo.f50959OooO0O0.getText().toString());
        ShareToFriendsActivity shareToFriendsActivity = this.f43864Oooo0o;
        liveDataShareTopic.observe(shareToFriendsActivity, new o0000OO0(shareToFriendsActivity, 3));
        return Unit.INSTANCE;
    }
}
