package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ComposableInferredTarget;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00OOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ViewGroup.LayoutParams f6587OooO00o = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00db  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @ComposableInferredTarget(scheme = "[0[0]]")
    @NotNull
    public static final p100o000oOoO.o00O0OO OooO00o(@NotNull AbstractComposeView abstractComposeView, @NotNull p100o000oOoO.o00O0OOO parent, @NotNull Function2<? super p100o000oOoO.oOO00O, ? super Integer, Unit> content) {
        AndroidComposeView androidComposeView;
        p100o000oOoO.o00O0OO o00o0ooOooO00o;
        int i;
        WrappedComposition wrappedComposition;
        Intrinsics.checkNotNullParameter(abstractComposeView, "<this>");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(content, "content");
        o000OOo0 o000ooo1 = o000OOo0.f6446OooO00o;
        boolean z = false;
        if (o000OOo0.f6447OooO0O0.compareAndSet(false, true)) {
            Channel channelChannel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
            o0000Ooo.OooO0OO oooO0OO = o0000Ooo.f6411OoooOOO;
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(o0000Ooo.f6412OoooOOo.getValue()), null, null, new o000O(channelChannel$default, null), 3, null);
            o000OO00 observer = new o000OO00(channelChannel$default);
            Intrinsics.checkNotNullParameter(observer, "observer");
            synchronized (p047Oooooo0.oo0o0O0.f4158OooO0OO) {
                p047Oooooo0.oo0o0O0.f4163OooO0oo.add(observer);
            }
            p047Oooooo0.oo0o0O0.OooO00o();
        }
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
            if (androidComposeView == null) {
                Context context = abstractComposeView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                androidComposeView = new AndroidComposeView(context);
                abstractComposeView.addView(androidComposeView.getView(), f6587OooO00o);
            }
            if (Build.VERSION.SDK_INT >= 29 && (!o0O00OO.f6586OooO00o.OooO00o(androidComposeView).isEmpty())) {
                z = true;
            }
            if (z) {
                androidComposeView.setTag(p048OoooooO.o0oOO.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
                Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
                try {
                    Field declaredField = o00oOoo.class.getDeclaredField("OooO0O0");
                    declaredField.setAccessible(true);
                    declaredField.setBoolean(null, true);
                } catch (Exception unused) {
                    Log.w("Wrapper", "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
                }
            }
            o00o0ooOooO00o = p100o000oOoO.o00OO000.OooO00o(new o000000.o0000O0(androidComposeView.getRoot()), parent);
            View view = androidComposeView.getView();
            i = p048OoooooO.o0oOO.wrapped_composition_tag;
            Object tag = view.getTag(i);
            wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
            if (wrappedComposition == null) {
                wrappedComposition = new WrappedComposition(androidComposeView, o00o0ooOooO00o);
                androidComposeView.getView().setTag(i, wrappedComposition);
            }
            wrappedComposition.OooO(content);
            return wrappedComposition;
        }
        abstractComposeView.removeAllViews();
        androidComposeView = null;
        if (androidComposeView == null) {
            Context context2 = abstractComposeView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            androidComposeView = new AndroidComposeView(context2);
            abstractComposeView.addView(androidComposeView.getView(), f6587OooO00o);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        if (z) {
            androidComposeView.setTag(p048OoooooO.o0oOO.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
            Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
            Field declaredField2 = o00oOoo.class.getDeclaredField("OooO0O0");
            declaredField2.setAccessible(true);
            declaredField2.setBoolean(null, true);
        }
        o00o0ooOooO00o = p100o000oOoO.o00OO000.OooO00o(new o000000.o0000O0(androidComposeView.getRoot()), parent);
        View view2 = androidComposeView.getView();
        i = p048OoooooO.o0oOO.wrapped_composition_tag;
        Object tag2 = view2.getTag(i);
        if (tag2 instanceof WrappedComposition) {
        }
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, o00o0ooOooO00o);
            androidComposeView.getView().setTag(i, wrappedComposition);
        }
        wrappedComposition.OooO(content);
        return wrappedComposition;
    }
}
