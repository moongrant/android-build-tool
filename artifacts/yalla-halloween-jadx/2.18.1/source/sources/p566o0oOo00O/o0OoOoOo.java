package p566o0oOo00O;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o00000;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOoOo extends o00000 {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45337OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOoOo(UserInfoActivity userInfoActivity, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f45337OooO0oo = userInfoActivity;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.ArrayList, java.util.List<androidx.fragment.app.Fragment>] */
    @Override // p105o000oo0o.o00Ooo
    public final int OooO0OO() {
        ?? r0 = this.f45337OooO0oo.f23460Oooooo0;
        if (r0 == 0) {
            return 0;
        }
        Intrinsics.checkNotNull(r0);
        return r0.size();
    }

    @Override // p105o000oo0o.o00Ooo
    @Nullable
    public final CharSequence OooO0o0(int i) {
        return OooOOO.OooO0OO(this.f45337OooO0oo.f23461OoooooO[i]);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.ArrayList, java.util.List<androidx.fragment.app.Fragment>] */
    @Override // androidx.fragment.app.o00000
    @NotNull
    public final Fragment OooOOOo(int i) {
        ?? r0 = this.f45337OooO0oo.f23460Oooooo0;
        Intrinsics.checkNotNull(r0);
        return (Fragment) r0.get(i);
    }
}
