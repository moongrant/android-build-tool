package p508o0o0O;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.squareup.okhttp.OooOo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p029Oooo0oo.oo0ooO;
import p081o000OoOO.OooO;
import p399o0Oo0O0O.o0OoOo0;
import p401o0Oo0OO0.o00O0O;
import p418o0OoO000.Oooo000;
import p466o0Oooo0o.oo00o;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b?\u0010@J\t\u0010\b\u001a\u00020\u0007H\u0096\u0001J\u0013\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0001J\u0011\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001JC\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u001d\u0010\u0013\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0011\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0002\b\u0012H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010 \u001a\u00020\u0007H\u0016J\b\u0010!\u001a\u00020\u0007H\u0016J\u001a\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014J!\u0010#\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH&¢\u0006\u0004\b#\u0010$J\b\u0010%\u001a\u00020\u0007H\u0016J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u001eH\u0016J\u0012\u0010)\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u001eH\u0016J\u0016\u0010,\u001a\u00020\u00072\f\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010*H\u0017J\u0014\u0010-\u001a\u00020\u00072\n\u0010+\u001a\u0006\u0012\u0002\b\u00030*H\u0017J\b\u0010.\u001a\u00020\u0007H\u0016R\"\u0010/\u001a\u00028\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R\u0011\u0010>\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lo0o0O/OooOO0O;", "Lo000OoOO/OooO;", "VB", "Lo0Oo0OO0/o00O0O;", "Landroid/view/View$OnClickListener;", "Lo0OoO000/Oooo000;", "Lo0Oo0O0O/o00O0O;", "", "clearComposeDialogCache", "Landroid/app/Activity;", "activity", "initDialogProxy", "", ViewHierarchyConstants.TAG_KEY, "", "removeComposeDialog", "Lkotlin/Function1;", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/Composable;", "content", "showDialog", "(Ljava/lang/String;Lkotlin/jvm/functions/Function3;)Landroidx/compose/runtime/MutableState;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "isBindingInitialized", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onResume", "onPause", "initViewBinding", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lo000OoOO/OooO;", "onDestroy", ViewHierarchyConstants.VIEW_KEY, "onNoDoubleClick", "v", "onClick", "Lo0OoO000/OooOo;", "msg", "onEvent", "onEventMainThread", "scrollTopRefresh", "binding", "Lo000OoOO/OooO;", "getBinding", "()Lo000OoOO/OooO;", "setBinding", "(Lo000OoOO/OooO;)V", "Lo0Oooo0o/oo00o;", "noDoubleClickListener", "Lo0Oooo0o/oo00o;", "", "resumeTime", "J", "timeLength", "getTimeLengthStr", "()Ljava/lang/String;", "timeLengthStr", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public abstract class OooOO0O<VB extends OooO> extends o00O0O implements View.OnClickListener, Oooo000, p399o0Oo0O0O.o00O0O {
    public static final int $stable = 8;
    public VB binding;
    private long resumeTime;
    private long timeLength;
    private final /* synthetic */ o0OoOo0 $$delegate_0 = new o0OoOo0();

    @NotNull
    private final oo00o noDoubleClickListener = new OooO00o(this);

    public static final class OooO00o extends oo00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ OooOO0O<VB> f50389OooO0oO;

        public OooO00o(OooOO0O<VB> oooOO0O) {
            this.f50389OooO0oO = oooOO0O;
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f50389OooO0oO.onNoDoubleClick(view);
        }
    }

    public void clearComposeDialogCache() {
        this.$$delegate_0.f44425OooO0o0.f44420OooO00o.clear();
    }

    @NotNull
    public final VB getBinding() {
        VB vb = this.binding;
        if (vb != null) {
            return vb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @NotNull
    public final String getTimeLengthStr() {
        return oo0ooO.OooO00o(this.timeLength);
    }

    @NotNull
    public abstract VB getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container);

    public void initDialogProxy(@Nullable Activity activity) {
        this.$$delegate_0.f44424OooO0Oo = activity;
    }

    @NotNull
    public View initViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        setBinding(getViewBinding(inflater, container));
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    public boolean isBindingInitialized() {
        return this.binding != null;
    }

    public void onClick(@Nullable View v) {
        this.noDoubleClickListener.onClick(v);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        OooOo.OooO0Oo(this);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            initDialogProxy(activity);
        }
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return initViewBinding(inflater, container);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        OooOo.OooO0o0(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.POSTING)
    public void onEvent(@Nullable p418o0OoO000.OooOo<?> msg) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(@NotNull p418o0OoO000.OooOo<?> msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    public void onNoDoubleClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.timeLength = System.currentTimeMillis() - this.resumeTime;
        OooOOO0.OooO0O0("ActivityTask Fragment " + getClass().getName() + " onPause -> isHide");
    }

    @Override // p401o0Oo0OO0.o00O0O, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        OooOOO0.OooO0O0("ActivityTask Fragment " + getClass().getName() + " onResume -> isVisible");
        this.resumeTime = System.currentTimeMillis();
    }

    public boolean removeComposeDialog(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return this.$$delegate_0.OooO00o(tag);
    }

    public void scrollTopRefresh() {
    }

    public final void setBinding(@NotNull VB vb) {
        Intrinsics.checkNotNullParameter(vb, "<set-?>");
        this.binding = vb;
    }

    @Override // p399o0Oo0O0O.o00O0O
    @ComposableInferredTarget(scheme = "[0[0]]")
    @Nullable
    public MutableState<Boolean> showDialog(@Nullable String tag, @NotNull Function3<? super MutableState<Boolean>, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return this.$$delegate_0.showDialog(tag, content);
    }
}
