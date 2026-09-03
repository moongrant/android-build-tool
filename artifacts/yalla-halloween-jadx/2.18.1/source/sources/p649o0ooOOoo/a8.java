package p649o0ooOOoo;

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
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class a8 implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f48904OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f48905OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Group f48906OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Group f48907OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Group f48908OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f48909OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f48910OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f48911OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f48912OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f48913OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final ImageView f48914OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f48915OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final SeekBar f48916OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final SeekBar f48917OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f48918OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f48919OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final TextView f48920OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f48921OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final TextView f48922OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final TextView f48923OooOo00;

    public a8(@NonNull ConstraintLayout constraintLayout, @NonNull Group group, @NonNull Group group2, @NonNull Group group3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull ImageView imageView8, @NonNull SeekBar seekBar, @NonNull SeekBar seekBar2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f48905OooO00o = constraintLayout;
        this.f48906OooO0O0 = group;
        this.f48907OooO0OO = group2;
        this.f48908OooO0Oo = group3;
        this.f48910OooO0o0 = imageView;
        this.f48909OooO0o = imageView2;
        this.f48911OooO0oO = imageView3;
        this.f48912OooO0oo = imageView4;
        this.f48904OooO = imageView5;
        this.f48913OooOO0 = imageView6;
        this.f48914OooOO0O = imageView7;
        this.f48915OooOO0o = imageView8;
        this.f48917OooOOO0 = seekBar;
        this.f48916OooOOO = seekBar2;
        this.f48918OooOOOO = textView;
        this.f48919OooOOOo = textView2;
        this.f48921OooOOo0 = textView3;
        this.f48920OooOOo = textView4;
        this.f48922OooOOoo = textView5;
        this.f48923OooOo00 = textView6;
    }

    @NonNull
    public static a8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f48905OooO00o;
    }

    @NonNull
    public static a8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_music, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.groupControl;
        Group group = (Group) o00Oo0.OooO00o(viewInflate, R.id.groupControl);
        if (group != null) {
            i = R.id.groupEmpty;
            Group group2 = (Group) o00Oo0.OooO00o(viewInflate, R.id.groupEmpty);
            if (group2 != null) {
                i = R.id.groupSound;
                Group group3 = (Group) o00Oo0.OooO00o(viewInflate, R.id.groupSound);
                if (group3 != null) {
                    i = R.id.ivDialogMusicLast;
                    ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivDialogMusicLast);
                    if (imageView != null) {
                        i = R.id.ivDialogMusicList;
                        ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivDialogMusicList);
                        if (imageView2 != null) {
                            i = R.id.iv_dialog_music_loop;
                            ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_dialog_music_loop);
                            if (imageView3 != null) {
                                i = R.id.ivDialogMusicNext;
                                ImageView imageView4 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivDialogMusicNext);
                                if (imageView4 != null) {
                                    i = R.id.ivDialogMusicPlay;
                                    ImageView imageView5 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivDialogMusicPlay);
                                    if (imageView5 != null) {
                                        i = R.id.ivHide;
                                        ImageView imageView6 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivHide);
                                        if (imageView6 != null) {
                                            i = R.id.ivMusicClose;
                                            ImageView imageView7 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivMusicClose);
                                            if (imageView7 != null) {
                                                i = R.id.ivMusicMore;
                                                ImageView imageView8 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivMusicMore);
                                                if (imageView8 != null) {
                                                    i = R.id.llMusicBottom;
                                                    if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llMusicBottom)) != null) {
                                                        i = R.id.llMusicProgress;
                                                        if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llMusicProgress)) != null) {
                                                            i = R.id.sbMusicProgress;
                                                            SeekBar seekBar = (SeekBar) o00Oo0.OooO00o(viewInflate, R.id.sbMusicProgress);
                                                            if (seekBar != null) {
                                                                i = R.id.sbMusicSound;
                                                                SeekBar seekBar2 = (SeekBar) o00Oo0.OooO00o(viewInflate, R.id.sbMusicSound);
                                                                if (seekBar2 != null) {
                                                                    i = R.id.tvMusicAdd;
                                                                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvMusicAdd);
                                                                    if (textView != null) {
                                                                        i = R.id.tvMusicEmpty;
                                                                        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvMusicEmpty)) != null) {
                                                                            i = R.id.tvMusicName;
                                                                            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvMusicName);
                                                                            if (textView2 != null) {
                                                                                i = R.id.tvMusicNameNext;
                                                                                TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvMusicNameNext);
                                                                                if (textView3 != null) {
                                                                                    i = R.id.tvMusicTime;
                                                                                    TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvMusicTime);
                                                                                    if (textView4 != null) {
                                                                                        i = R.id.tvMusicTimeTotal;
                                                                                        TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvMusicTimeTotal);
                                                                                        if (textView5 != null) {
                                                                                            i = R.id.tvSound;
                                                                                            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvSound)) != null) {
                                                                                                i = R.id.tvSoundCancel;
                                                                                                TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvSoundCancel);
                                                                                                if (textView6 != null) {
                                                                                                    return new a8((ConstraintLayout) viewInflate, group, group2, group3, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, seekBar, seekBar2, textView, textView2, textView3, textView4, textView5, textView6);
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
