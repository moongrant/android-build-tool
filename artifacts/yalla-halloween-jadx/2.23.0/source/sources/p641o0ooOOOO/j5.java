package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class j5 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f58166OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58167OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final s0 f58168OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f58169OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58170OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final p5 f58171OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final o5 f58172OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final q5 f58173OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ComposeView f58174OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f58175OooOO0;

    public j5(@NonNull FrameLayout frameLayout, @NonNull s0 s0Var, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull o5 o5Var, @NonNull p5 p5Var, @NonNull q5 q5Var, @NonNull ComposeView composeView, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.f58167OooO00o = frameLayout;
        this.f58168OooO0O0 = s0Var;
        this.f58169OooO0OO = view;
        this.f58170OooO0Oo = linearLayout;
        this.f58172OooO0o0 = o5Var;
        this.f58171OooO0o = p5Var;
        this.f58173OooO0oO = q5Var;
        this.f58174OooO0oo = composeView;
        this.f58166OooO = recyclerView;
        this.f58175OooOO0 = textView;
    }

    @NonNull
    public static j5 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58167OooO00o;
    }

    @NonNull
    public static j5 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.message_fragment_private_chat, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.base_header_layout;
        View viewOooO00o2 = OooOO0.OooO00o(i, viewInflate);
        if (viewOooO00o2 != null) {
            s0 s0VarOooO00o = s0.OooO00o(viewOooO00o2);
            i = oO00O0oO.bottomViewPlaceHolder;
            View viewOooO00o3 = OooOO0.OooO00o(i, viewInflate);
            if (viewOooO00o3 != null) {
                i = oO00O0oO.flChat;
                if (((FrameLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                    i = oO00O0oO.ivYallaChat;
                    if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                        i = oO00O0oO.layoutYallaChat;
                        LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                        if (linearLayout != null) {
                            i = oO00O0oO.llChatRoot;
                            if (((LinearLayout) OooOO0.OooO00o(i, viewInflate)) != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.message_layout_chat_in_room_tips), viewInflate)) != null) {
                                o5 o5VarOooO00o = o5.OooO00o(viewOooO00o);
                                i = oO00O0oO.message_layout_chat_voice;
                                View viewOooO00o4 = OooOO0.OooO00o(i, viewInflate);
                                if (viewOooO00o4 != null) {
                                    p5 p5VarOooO00o = p5.OooO00o(viewOooO00o4);
                                    i = oO00O0oO.message_layout_chat_warn_tips;
                                    View viewOooO00o5 = OooOO0.OooO00o(i, viewInflate);
                                    if (viewOooO00o5 != null) {
                                        q5 q5VarOooO00o = q5.OooO00o(viewOooO00o5);
                                        i = oO00O0oO.private_chat_bottom_compose;
                                        ComposeView composeView = (ComposeView) OooOO0.OooO00o(i, viewInflate);
                                        if (composeView != null) {
                                            i = oO00O0oO.rvChat;
                                            RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
                                            if (recyclerView != null) {
                                                i = oO00O0oO.tvYallaChat;
                                                TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                if (textView != null) {
                                                    return new j5((FrameLayout) viewInflate, s0VarOooO00o, viewOooO00o3, linearLayout, o5VarOooO00o, p5VarOooO00o, q5VarOooO00o, composeView, recyclerView, textView);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
