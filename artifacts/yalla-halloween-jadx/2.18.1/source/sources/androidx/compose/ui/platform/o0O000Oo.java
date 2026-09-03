package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0O000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Map<Context, StateFlow<Float>> f6580OooO00o = new LinkedHashMap();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final StateFlow OooO00o(Context context) {
        StateFlow<Float> stateFlow;
        Map<Context, StateFlow<Float>> map = f6580OooO00o;
        synchronized (map) {
            StateFlow<Float> stateFlowStateIn = map.get(context);
            if (stateFlowStateIn == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                Channel channelChannel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
                stateFlowStateIn = FlowKt.stateIn(FlowKt.flow(new o0O000O(contentResolver, uriFor, new o0OoOoOo(channelChannel$default, o000O00O.OooOO0O.OooO00o(Looper.getMainLooper())), channelChannel$default, context, null)), CoroutineScopeKt.MainScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                map.put(context, stateFlowStateIn);
            }
            stateFlow = stateFlowStateIn;
        }
        return stateFlow;
    }

    @Nullable
    public static final p100o000oOoO.o00O0OOO OooO0O0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(p048OoooooO.o0oOO.androidx_compose_ui_view_composition_context);
        if (tag instanceof p100o000oOoO.o00O0OOO) {
            return (p100o000oOoO.o00O0OOO) tag;
        }
        return null;
    }

    public static final void OooO0OO(@NotNull View view, @Nullable p100o000oOoO.o00O0OOO o00o0ooo2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(p048OoooooO.o0oOO.androidx_compose_ui_view_composition_context, o00o0ooo2);
    }
}
