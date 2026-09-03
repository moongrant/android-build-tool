package p536o0o0OOoo;

import Oooo000.o00O0O;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.o000O0Oo;
import p563o0oOo0.o00O0000;
import p649o0ooOOoo.fc;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class g1 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f43790Oooo;

    public g1(ShareToFriendsActivity shareToFriendsActivity) {
        this.f43790Oooo = shareToFriendsActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@Nullable View view) {
        o00O0000 o00o0001 = this.f43790Oooo.f22218OoooooO;
        fc fcVar = null;
        if (o00o0001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o00o0001 = null;
        }
        if (!o00o0001.f45071OooOOo0) {
            fc fcVar2 = this.f43790Oooo.f22211Ooooo00;
            if (fcVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            } else {
                fcVar = fcVar2;
            }
            EditText editSearch = fcVar.f49362OooO0O0.getEditSearch();
            o00O0O.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editSearch.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(editSearch, "view.context"), new Handler()));
            this.f43790Oooo.finish();
            return;
        }
        o00O0000 o00o0002 = this.f43790Oooo.f22216Oooooo;
        if (o00o0002 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            o00o0002 = null;
        }
        o00o0002.OooO0oo(false);
        o00O0000 o00o0003 = this.f43790Oooo.f22218OoooooO;
        if (o00o0003 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o00o0003 = null;
        }
        o00o0003.OooO0oo(false);
        fc fcVar3 = this.f43790Oooo.f22211Ooooo00;
        if (fcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            fcVar3 = null;
        }
        if (fcVar3.f49362OooO0O0.getSearchText().length() > 0) {
            o00O0000 o00o0004 = this.f43790Oooo.f22218OoooooO;
            if (o00o0004 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                o00o0004 = null;
            }
            if (o00o0004.getItemCount() <= 0) {
                fc fcVar4 = this.f43790Oooo.f22211Ooooo00;
                if (fcVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                    fcVar4 = null;
                }
                fcVar4.f49362OooO0O0.getEditSearch().setText((CharSequence) null);
                fc fcVar5 = this.f43790Oooo.f22211Ooooo00;
                if (fcVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                    fcVar5 = null;
                }
                fcVar5.f49362OooO0O0.getEditSearch().clearFocus();
                fc fcVar6 = this.f43790Oooo.f22211Ooooo00;
                if (fcVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                } else {
                    fcVar = fcVar6;
                }
                EditText editSearch2 = fcVar.f49362OooO0O0.getEditSearch();
                o00O0O.OooO00o(editSearch2, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editSearch2.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(editSearch2, "view.context"), new Handler()));
            }
        }
        ShareToFriendsActivity.OooOooO(this.f43790Oooo);
    }
}
