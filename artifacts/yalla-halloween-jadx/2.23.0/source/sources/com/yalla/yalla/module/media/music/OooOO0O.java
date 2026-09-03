package com.yalla.yalla.module.media.music;

import android.R;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p575o0oOoOo.o0O0o00O;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f24585OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<String> f24586OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0o00O f24587OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(AppCompatActivity appCompatActivity, MutableState mutableState, o0O0o00O o0o0o00o) {
        super(0);
        this.f24585OooO0Oo = appCompatActivity;
        this.f24587OooO0o0 = o0o0o00o;
        this.f24586OooO0o = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AppCompatActivity activity = this.f24585OooO0Oo;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
        Function1 function1 = MusicScreen.searchTextSetter;
        if (function1 != null) {
            function1.invoke("");
        }
        MutableState<String> mutableState = this.f24586OooO0o;
        MusicScreen.Content$lambda$13(mutableState, "");
        MusicScreen.INSTANCE.handleSearchResult(MusicScreen.Content$lambda$12(mutableState), this.f24587OooO0o0, activity);
        return Unit.INSTANCE;
    }
}
