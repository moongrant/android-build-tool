package OooO0o;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.yallatech.support.platform.base.web.WebBrowser;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p604o0oo0OO.o000000;
import p604o0oo0OO.o000000O;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOooO0o/OooO00o;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public class OooO00o extends Fragment {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ViewStub f116OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public WebBrowser f117OooO0o0;

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        WebBrowser webBrowser = this.f117OooO0o0;
        if (webBrowser == null) {
            return;
        }
        webBrowser.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return LayoutInflater.from(getContext()).inflate(o000000O.base_platform_fragment_platform_web, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        WebBrowser webBrowser = this.f117OooO0o0;
        if (webBrowser == null) {
            return;
        }
        try {
            webBrowser.getWebView().destroy();
            Result.m4213constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.m4213constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, permissions, grantResults);
        WebBrowser webBrowser = this.f117OooO0o0;
        if (webBrowser == null) {
            return;
        }
        webBrowser.onRequestPermissionsResult(i, permissions, grantResults);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(o000000.webViewStub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.webViewStub)");
        ViewStub viewStub = (ViewStub) viewFindViewById;
        Intrinsics.checkNotNullParameter(viewStub, "<set-?>");
        this.f116OooO0Oo = viewStub;
    }
}
