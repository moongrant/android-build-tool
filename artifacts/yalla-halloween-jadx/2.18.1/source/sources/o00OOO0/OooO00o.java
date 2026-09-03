package o00OOO0;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import o00OOO00.OooOO0;
import o00OOO00.OooOO0O;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p034OoooO0O.o0Oo0oo;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.oOO00O;
import p140o00OOOoO.OooO0o;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b+\u0010,J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\u0013\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0001J\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0001JC\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00102\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u001d\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0010\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0002\b\u0011H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\rH\u0014J\b\u0010\u001a\u001a\u00020\u0006H\u0014J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\u0016\u0010\u001e\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001cH\u0017J\u0016\u0010\u001f\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001cH\u0017J\u0010\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020%H\u0016J\u0010\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\"H\u0016J\u0010\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\"H\u0016¨\u0006-"}, d2 = {"Lo00OOO0/OooO00o;", "Lo00OOO0/OooO0OO;", "Landroid/view/View$OnClickListener;", "Lo00OOOoO/OooO0o;", "Lo00Oo00/OooO00o;", "Lo00OOO00/OooOO0O;", "", "clearComposeDialogCache", "Landroid/app/Activity;", "activity", "initDialogProxy", "", ViewHierarchyConstants.TAG_KEY, "", "removeComposeDialog", "Lkotlin/Function1;", "Lo000oOoO/o0O00OO;", "Landroidx/compose/runtime/Composable;", "content", "showDialog", "(Ljava/lang/String;Lkotlin/jvm/functions/Function3;)Lo000oOoO/o0O00OO;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "isTrueVisibleToUser", "onTrueVisibleChanged", "onLazyInit", "onDestroy", "Lo00OOOoO/OooO0OO;", "msg", "onEvent", "onEventMainThread", "", "id", "Landroid/view/View;", "findViewByIdNoClick", "findViewByIdOnClick", "Lo0ooo/o00Oo0;", "getNoDoubleClickListener", ViewHierarchyConstants.VIEW_KEY, "onClickNotDouble", ak.aE, "onClick", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public class OooO00o extends OooO0OO implements View.OnClickListener, OooO0o, o00Oo00.OooO00o, OooOO0O {
    public static final int $stable = 8;
    private boolean isLazyInitialized;

    @JvmField
    @Nullable
    public View rootView;
    private final /* synthetic */ OooOO0 $$delegate_0 = new OooOO0();

    @NotNull
    private final o00Oo0 mNoDoubleClickListener = new C0343OooO00o();

    /* JADX INFO: renamed from: o00OOO0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0343OooO00o extends o00Oo0 {
        public C0343OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            OooO00o.this.onClickNotDouble(view);
        }
    }

    public void clearComposeDialogCache() {
        this.$$delegate_0.OooO00o();
    }

    @NotNull
    public View findViewByIdNoClick(int id) {
        View viewOooO00o = p148o00Oo0O.o00Oo0.OooO00o(this.rootView, id, null);
        Intrinsics.checkNotNullExpressionValue(viewOooO00o, "findViewClick(rootView, id, null)");
        return viewOooO00o;
    }

    @NotNull
    public View findViewByIdOnClick(int id) {
        View viewOooO00o = p148o00Oo0O.o00Oo0.OooO00o(this.rootView, id, getMNoDoubleClickListener());
        Intrinsics.checkNotNullExpressionValue(viewOooO00o, "findViewClick(rootView, id, noDoubleClickListener)");
        return viewOooO00o;
    }

    @NotNull
    /* JADX INFO: renamed from: getNoDoubleClickListener, reason: from getter */
    public o00Oo0 getMNoDoubleClickListener() {
        return this.mNoDoubleClickListener;
    }

    public void initDialogProxy(@Nullable Activity activity) {
        this.$$delegate_0.f31673Oooo0o = activity;
    }

    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.mNoDoubleClickListener.onClick(v);
    }

    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        o0Oo0oo.OooO0oo(this);
        initDialogProxy(getActivity());
        super.onCreate(savedInstanceState);
    }

    @Override // o00OOO0.OooO0OO, androidx.fragment.app.Fragment
    public void onDestroy() {
        o0Oo0oo.OooO(this);
        super.onDestroy();
        clearComposeDialogCache();
    }

    @Override // p140o00OOOoO.OooO0o
    @Subscribe(threadMode = ThreadMode.POSTING)
    public void onEvent(@Nullable p140o00OOOoO.OooO0OO<?> msg) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(@Nullable p140o00OOOoO.OooO0OO<?> msg) {
    }

    public void onLazyInit() {
    }

    @Override // o00OOO0.OooO0OO
    public void onTrueVisibleChanged(boolean isTrueVisibleToUser) {
        super.onTrueVisibleChanged(isTrueVisibleToUser);
        if (!isTrueVisibleToUser || this.isLazyInitialized) {
            return;
        }
        onLazyInit();
        this.isLazyInitialized = true;
    }

    public boolean removeComposeDialog(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return this.$$delegate_0.OooO0O0(tag);
    }

    @Override // o00OOO00.OooOO0O
    @ComposableInferredTarget(scheme = "[0[0]]")
    @Nullable
    public o0O00OO<Boolean> showDialog(@Nullable String tag, @NotNull Function3<? super o0O00OO<Boolean>, ? super oOO00O, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return this.$$delegate_0.showDialog(tag, content);
    }
}
