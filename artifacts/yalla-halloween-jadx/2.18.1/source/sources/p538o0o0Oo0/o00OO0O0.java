package p538o0o0Oo0;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO0O0 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentSonListActivity f43965Oooo0o;

    public o00OO0O0(PostDetailCommentSonListActivity postDetailCommentSonListActivity) {
        this.f43965Oooo0o = postDetailCommentSonListActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@NotNull Editable s) {
        Intrinsics.checkNotNullParameter(s, "s");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@NotNull CharSequence s, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(s, "s");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@NotNull CharSequence string, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (TextUtils.isEmpty(string)) {
            PostDetailCommentSonListActivity postDetailCommentSonListActivity = this.f43965Oooo0o;
            PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22473o0ooOOo;
            postDetailCommentSonListActivity.Oooo000().f49459OooO0oO.setClickable(false);
            this.f43965Oooo0o.Oooo000().f49459OooO0oO.setImageResource(R.drawable.btn_send);
            return;
        }
        PostDetailCommentSonListActivity postDetailCommentSonListActivity2 = this.f43965Oooo0o;
        PostDetailCommentSonListActivity.OooO00o oooO00o2 = PostDetailCommentSonListActivity.f22473o0ooOOo;
        postDetailCommentSonListActivity2.Oooo000().f49459OooO0oO.setClickable(true);
        this.f43965Oooo0o.Oooo000().f49459OooO0oO.setImageResource(R.drawable.btn_send2);
    }
}
