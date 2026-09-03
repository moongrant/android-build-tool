package p496o0o00o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o00000OO;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0ooO extends o00000OO {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49205OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0ooO(UserInfoActivity userInfoActivity, FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.f49205OooO0oo = userInfoActivity;
    }

    @Override // p082o000OoOo.OooOO0O
    public final int OooO0OO() {
        ArrayList arrayList = this.f49205OooO0oo.f27248OooOoO0;
        if (arrayList == null) {
            return 0;
        }
        Intrinsics.checkNotNull(arrayList);
        return arrayList.size();
    }

    @Override // p082o000OoOo.OooOO0O
    @Nullable
    public final CharSequence OooO0o0(int i) {
        return o0000.OooO0OO(this.f49205OooO0oo.f27249OooOoOO[i]);
    }

    @Override // androidx.fragment.app.o00000OO
    @NotNull
    public final Fragment OooOOo0(int i) {
        ArrayList arrayList = this.f49205OooO0oo.f27248OooOoO0;
        Intrinsics.checkNotNull(arrayList);
        return (Fragment) arrayList.get(i);
    }
}
