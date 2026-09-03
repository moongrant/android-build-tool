package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O00oO implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f44878OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44879OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o00O f44880OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f44881OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44882OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final oOo0o0oO f44883OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final oO0O0Oo0 f44884OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ooOOO0Oo f44885OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ComposeView f44886OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f44887OooOO0;

    public oO0O00oO(@NonNull FrameLayout frameLayout, @NonNull o00O o00o2, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull oO0O0Oo0 oo0o0oo0, @NonNull oOo0o0oO ooo0o0oo, @NonNull ooOOO0Oo ooooo0oo, @NonNull ComposeView composeView, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.f44879OooO00o = frameLayout;
        this.f44880OooO0O0 = o00o2;
        this.f44881OooO0OO = view;
        this.f44882OooO0Oo = linearLayout;
        this.f44884OooO0o0 = oo0o0oo0;
        this.f44883OooO0o = ooo0o0oo;
        this.f44885OooO0oO = ooooo0oo;
        this.f44886OooO0oo = composeView;
        this.f44878OooO = recyclerView;
        this.f44887OooOO0 = textView;
    }

    @NonNull
    public static oO0O00oO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44879OooO00o;
    }

    @NonNull
    public static oO0O00oO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.message_fragment_private_chat, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.base_header_layout;
        View viewOooO00o2 = OooO0O0.OooO00o(i, viewInflate);
        if (viewOooO00o2 != null) {
            o00O o00oOooO00o = o00O.OooO00o(viewOooO00o2);
            i = o0OO00O.bottomViewPlaceHolder;
            View viewOooO00o3 = OooO0O0.OooO00o(i, viewInflate);
            if (viewOooO00o3 != null) {
                i = o0OO00O.flChat;
                if (((FrameLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                    i = o0OO00O.ivYallaChat;
                    if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        i = o0OO00O.layoutYallaChat;
                        LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                        if (linearLayout != null) {
                            i = o0OO00O.llChatRoot;
                            if (((LinearLayout) OooO0O0.OooO00o(i, viewInflate)) != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.message_layout_chat_in_room_tips), viewInflate)) != null) {
                                oO0O0Oo0 oo0o0oo0OooO00o = oO0O0Oo0.OooO00o(viewOooO00o);
                                i = o0OO00O.message_layout_chat_voice;
                                View viewOooO00o4 = OooO0O0.OooO00o(i, viewInflate);
                                if (viewOooO00o4 != null) {
                                    oOo0o0oO ooo0o0ooOooO00o = oOo0o0oO.OooO00o(viewOooO00o4);
                                    i = o0OO00O.message_layout_chat_warn_tips;
                                    View viewOooO00o5 = OooO0O0.OooO00o(i, viewInflate);
                                    if (viewOooO00o5 != null) {
                                        ooOOO0Oo ooooo0ooOooO00o = ooOOO0Oo.OooO00o(viewOooO00o5);
                                        i = o0OO00O.private_chat_bottom_compose;
                                        ComposeView composeView = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
                                        if (composeView != null) {
                                            i = o0OO00O.rvChat;
                                            RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
                                            if (recyclerView != null) {
                                                i = o0OO00O.tvYallaChat;
                                                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                if (textView != null) {
                                                    return new oO0O00oO((FrameLayout) viewInflate, o00oOooO00o, viewOooO00o3, linearLayout, oo0o0oo0OooO00o, ooo0o0ooOooO00o, ooooo0ooOooO00o, composeView, recyclerView, textView);
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
