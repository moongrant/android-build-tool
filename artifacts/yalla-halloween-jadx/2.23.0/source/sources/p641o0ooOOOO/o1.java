package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o1 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f58479OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58480OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Group f58481OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Group f58482OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Group f58483OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f58484OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f58485OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f58486OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f58487OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f58488OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final ImageView f58489OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f58490OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final SeekBar f58491OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final SeekBar f58492OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f58493OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f58494OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final TextView f58495OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f58496OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final TextView f58497OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final TextView f58498OooOo00;

    public o1(@NonNull ConstraintLayout constraintLayout, @NonNull Group group, @NonNull Group group2, @NonNull Group group3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull ImageView imageView8, @NonNull SeekBar seekBar, @NonNull SeekBar seekBar2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f58480OooO00o = constraintLayout;
        this.f58481OooO0O0 = group;
        this.f58482OooO0OO = group2;
        this.f58483OooO0Oo = group3;
        this.f58485OooO0o0 = imageView;
        this.f58484OooO0o = imageView2;
        this.f58486OooO0oO = imageView3;
        this.f58487OooO0oo = imageView4;
        this.f58479OooO = imageView5;
        this.f58488OooOO0 = imageView6;
        this.f58489OooOO0O = imageView7;
        this.f58490OooOO0o = imageView8;
        this.f58492OooOOO0 = seekBar;
        this.f58491OooOOO = seekBar2;
        this.f58493OooOOOO = textView;
        this.f58494OooOOOo = textView2;
        this.f58496OooOOo0 = textView3;
        this.f58495OooOOo = textView4;
        this.f58497OooOOoo = textView5;
        this.f58498OooOo00 = textView6;
    }

    @NonNull
    public static o1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58480OooO00o;
    }

    @NonNull
    public static o1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.dialog_music, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.groupControl;
        Group group = (Group) OooOO0.OooO00o(i, viewInflate);
        if (group != null) {
            i = oO00O0oO.groupEmpty;
            Group group2 = (Group) OooOO0.OooO00o(i, viewInflate);
            if (group2 != null) {
                i = oO00O0oO.groupSound;
                Group group3 = (Group) OooOO0.OooO00o(i, viewInflate);
                if (group3 != null) {
                    i = oO00O0oO.ivDialogMusicLast;
                    ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                    if (imageView != null) {
                        i = oO00O0oO.ivDialogMusicList;
                        ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                        if (imageView2 != null) {
                            i = oO00O0oO.iv_dialog_music_loop;
                            ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                            if (imageView3 != null) {
                                i = oO00O0oO.ivDialogMusicNext;
                                ImageView imageView4 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                if (imageView4 != null) {
                                    i = oO00O0oO.ivDialogMusicPlay;
                                    ImageView imageView5 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                    if (imageView5 != null) {
                                        i = oO00O0oO.ivHide;
                                        ImageView imageView6 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                        if (imageView6 != null) {
                                            i = oO00O0oO.ivMusicClose;
                                            ImageView imageView7 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                            if (imageView7 != null) {
                                                i = oO00O0oO.ivMusicMore;
                                                ImageView imageView8 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                                if (imageView8 != null) {
                                                    i = oO00O0oO.llMusicBottom;
                                                    if (((LinearLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                        i = oO00O0oO.llMusicProgress;
                                                        if (((LinearLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                            i = oO00O0oO.sbMusicProgress;
                                                            SeekBar seekBar = (SeekBar) OooOO0.OooO00o(i, viewInflate);
                                                            if (seekBar != null) {
                                                                i = oO00O0oO.sbMusicSound;
                                                                SeekBar seekBar2 = (SeekBar) OooOO0.OooO00o(i, viewInflate);
                                                                if (seekBar2 != null) {
                                                                    i = oO00O0oO.tvMusicAdd;
                                                                    TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                    if (textView != null) {
                                                                        i = oO00O0oO.tvMusicEmpty;
                                                                        if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                            i = oO00O0oO.tvMusicName;
                                                                            TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                            if (textView2 != null) {
                                                                                i = oO00O0oO.tvMusicNameNext;
                                                                                TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                                if (textView3 != null) {
                                                                                    i = oO00O0oO.tvMusicTime;
                                                                                    TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                                    if (textView4 != null) {
                                                                                        i = oO00O0oO.tvMusicTimeTotal;
                                                                                        TextView textView5 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                                        if (textView5 != null) {
                                                                                            i = oO00O0oO.tvSound;
                                                                                            if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                                                i = oO00O0oO.tvSoundCancel;
                                                                                                TextView textView6 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                                                if (textView6 != null) {
                                                                                                    return new o1((ConstraintLayout) viewInflate, group, group2, group3, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, seekBar, seekBar2, textView, textView2, textView3, textView4, textView5, textView6);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
