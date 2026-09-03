package com.google.android.material.search;

import android.animation.AnimatorSet;
import android.view.View;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p491o0o00O0o.o0O00000;
import p509o0o00ooO.p1;
import p583o0oOoo00.o00000OO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f17021OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f17022OooO0o0;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f17021OooO0Oo = i;
        this.f17022OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function1<? super ChatModel, Unit> function1;
        int i = this.f17021OooO0Oo;
        int i2 = 0;
        Object obj = this.f17022OooO0o0;
        switch (i) {
            case 0:
                SearchView searchView = (SearchView) obj;
                if (!searchView.f17078OooOoo0.equals(SearchView.TransitionState.HIDDEN) && !searchView.f17078OooOoo0.equals(SearchView.TransitionState.HIDING)) {
                    oo000o oo000oVar = searchView.f17066OooOOo;
                    SearchBar searchBar = oo000oVar.f17100OooOOO0;
                    SearchView searchView2 = oo000oVar.f17089OooO00o;
                    if (searchBar != null) {
                        if (searchView2.OooO0OO()) {
                            searchView2.OooO0O0();
                        }
                        AnimatorSet animatorSetOooO0OO = oo000oVar.OooO0OO(false);
                        animatorSetOooO0OO.addListener(new o00O0O(oo000oVar));
                        animatorSetOooO0OO.start();
                    } else {
                        if (searchView2.OooO0OO()) {
                            searchView2.OooO0O0();
                        }
                        AnimatorSet animatorSetOooO0oO = oo000oVar.OooO0oO(false);
                        animatorSetOooO0oO.addListener(new o00Ooo(oo000oVar));
                        animatorSetOooO0oO.start();
                    }
                    searchView.setModalForAccessibility(false);
                    break;
                }
                break;
            case 1:
                PhoneNumberActivity this$0 = (PhoneNumberActivity) obj;
                int i3 = PhoneNumberActivity.f24807OooOoO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0oo0000.OooO00o.OooO0O0("101060");
                o00000OO.f56665OooO0oO.observe(this$0, new o0O00000(this$0, i2));
                break;
            default:
                p1 this$1 = (p1) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                ChatModel chatModel = this$1.f50771OooOo0o;
                if (chatModel != null && (function1 = this$1.f50755OooO0o0) != null) {
                    function1.invoke(chatModel);
                    break;
                }
                break;
        }
    }
}
