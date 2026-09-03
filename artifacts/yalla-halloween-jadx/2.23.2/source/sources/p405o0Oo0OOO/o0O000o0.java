package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000o0 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f44414OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44415OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Group f44416OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Group f44417OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Group f44418OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f44419OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f44420OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f44421OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f44422OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f44423OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final ImageView f44424OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f44425OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final SeekBar f44426OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final SeekBar f44427OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f44428OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f44429OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final TextView f44430OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f44431OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final TextView f44432OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final TextView f44433OooOo00;

    public o0O000o0(@NonNull ConstraintLayout constraintLayout, @NonNull Group group, @NonNull Group group2, @NonNull Group group3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull ImageView imageView8, @NonNull SeekBar seekBar, @NonNull SeekBar seekBar2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f44415OooO00o = constraintLayout;
        this.f44416OooO0O0 = group;
        this.f44417OooO0OO = group2;
        this.f44418OooO0Oo = group3;
        this.f44420OooO0o0 = imageView;
        this.f44419OooO0o = imageView2;
        this.f44421OooO0oO = imageView3;
        this.f44422OooO0oo = imageView4;
        this.f44414OooO = imageView5;
        this.f44423OooOO0 = imageView6;
        this.f44424OooOO0O = imageView7;
        this.f44425OooOO0o = imageView8;
        this.f44427OooOOO0 = seekBar;
        this.f44426OooOOO = seekBar2;
        this.f44428OooOOOO = textView;
        this.f44429OooOOOo = textView2;
        this.f44431OooOOo0 = textView3;
        this.f44430OooOOo = textView4;
        this.f44432OooOOoo = textView5;
        this.f44433OooOo00 = textView6;
    }

    @NonNull
    public static o0O000o0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44415OooO00o;
    }

    @NonNull
    public static o0O000o0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.dialog_music, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.groupControl;
        Group group = (Group) OooO0O0.OooO00o(i, viewInflate);
        if (group != null) {
            i = o0OO00O.groupEmpty;
            Group group2 = (Group) OooO0O0.OooO00o(i, viewInflate);
            if (group2 != null) {
                i = o0OO00O.groupSound;
                Group group3 = (Group) OooO0O0.OooO00o(i, viewInflate);
                if (group3 != null) {
                    i = o0OO00O.ivDialogMusicLast;
                    ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (imageView != null) {
                        i = o0OO00O.ivDialogMusicList;
                        ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                        if (imageView2 != null) {
                            i = o0OO00O.iv_dialog_music_loop;
                            ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                            if (imageView3 != null) {
                                i = o0OO00O.ivDialogMusicNext;
                                ImageView imageView4 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                if (imageView4 != null) {
                                    i = o0OO00O.ivDialogMusicPlay;
                                    ImageView imageView5 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                    if (imageView5 != null) {
                                        i = o0OO00O.ivHide;
                                        ImageView imageView6 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                        if (imageView6 != null) {
                                            i = o0OO00O.ivMusicClose;
                                            ImageView imageView7 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                            if (imageView7 != null) {
                                                i = o0OO00O.ivMusicMore;
                                                ImageView imageView8 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                                if (imageView8 != null) {
                                                    i = o0OO00O.llMusicBottom;
                                                    if (((LinearLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                        i = o0OO00O.llMusicProgress;
                                                        if (((LinearLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                            i = o0OO00O.sbMusicProgress;
                                                            SeekBar seekBar = (SeekBar) OooO0O0.OooO00o(i, viewInflate);
                                                            if (seekBar != null) {
                                                                i = o0OO00O.sbMusicSound;
                                                                SeekBar seekBar2 = (SeekBar) OooO0O0.OooO00o(i, viewInflate);
                                                                if (seekBar2 != null) {
                                                                    i = o0OO00O.tvMusicAdd;
                                                                    TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                    if (textView != null) {
                                                                        i = o0OO00O.tvMusicEmpty;
                                                                        if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                            i = o0OO00O.tvMusicName;
                                                                            TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                            if (textView2 != null) {
                                                                                i = o0OO00O.tvMusicNameNext;
                                                                                TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                                if (textView3 != null) {
                                                                                    i = o0OO00O.tvMusicTime;
                                                                                    TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                                    if (textView4 != null) {
                                                                                        i = o0OO00O.tvMusicTimeTotal;
                                                                                        TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                                        if (textView5 != null) {
                                                                                            i = o0OO00O.tvSound;
                                                                                            if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                                                i = o0OO00O.tvSoundCancel;
                                                                                                TextView textView6 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                                                if (textView6 != null) {
                                                                                                    return new o0O000o0((ConstraintLayout) viewInflate, group, group2, group3, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, seekBar, seekBar2, textView, textView2, textView3, textView4, textView5, textView6);
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
