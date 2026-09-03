package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.RepeatModeUtil;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p022Oooo00O.o0O0OO0;
import p203o00o0o0o.o00OOO0;
import p226o00oOo00.o000O00O;
import p241o00oo0O.o0O0ooO;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;
import p247o00oo0oO.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class StyledPlayerControlView extends FrameLayout {

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public static final float[] f13882o0OOO0o;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOO0 f13883OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0000 f13884OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0O0 f13885OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Resources f13886OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final CopyOnWriteArrayList<OooOOOO> f13887OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final RecyclerView f13888OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO0o f13889OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOO0O f13890OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooO00o f13891OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final PopupWindow f13892OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final com.google.android.exoplayer2.ui.OooO0OO f13893OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f13894OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public final View f13895OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public final View f13896OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public final View f13897OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public final View f13898OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public final ImageView f13899OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public final TextView f13900OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public final View f13901OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public final TextView f13902OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public final ImageView f13903OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public final ImageView f13904OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public final View f13905OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public final ImageView f13906OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public final View f13907OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public final ImageView f13908OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public final View f13909OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public final View f13910OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final Drawable f13911Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final StringBuilder f13912Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public final TextView f13913Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public final TextView f13914Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @Nullable
    public final o0000O0 f13915Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final Formatter f13916Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final com.google.android.exoplayer2.oo0o0Oo.OooO0O0 f13917Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o0O0OO0 f13918Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final com.google.android.exoplayer2.oo0o0Oo.OooO0OO f13919Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Drawable f13920Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Drawable f13921Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final Drawable f13922OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final String f13923OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final String f13924OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final String f13925OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final Drawable f13926OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final float f13927OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final String f13928OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final String f13929OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final Drawable f13930OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final Drawable f13931OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final String f13932Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final String f13933Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final Drawable f13934OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final Drawable f13935OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final String f13936OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    public Player f13937Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final String f13938Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @Nullable
    public OooO0OO f13939OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public boolean f13940Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final float f13941o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public boolean f13942o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public boolean f13943o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public int f13944o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public int f13945o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public final long[] f13946o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public boolean[] f13947o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public int f13948o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f13949o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public final boolean[] f13950o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public long f13951o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public boolean f13952o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public long[] f13953oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public boolean f13954ooOO;

    public interface OooO {
    }

    public final class OooO00o extends OooOOO {
        public OooO00o() {
            super();
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.OooOOO
        public final void OooO0O0(SubSettingViewHolder subSettingViewHolder) {
            subSettingViewHolder.textView.setText(Oooo0.exo_track_selection_auto);
            Player player = StyledPlayerControlView.this.f13937Oooooo;
            player.getClass();
            subSettingViewHolder.checkView.setVisibility(OooO0Oo(player.OooOO0o()) ? 4 : 0);
            subSettingViewHolder.itemView.setOnClickListener(new androidx.media3.ui.OooOO0(this, 1));
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.OooOOO
        public final void OooO0OO(String str) {
            StyledPlayerControlView.this.f13883OooO.f13962OooO0O0[1] = str;
        }

        public final boolean OooO0Oo(com.google.android.exoplayer2.trackselection.OooO oooO) {
            for (int i = 0; i < this.f13966OooO00o.size(); i++) {
                if (oooO.f13571OooOoo0.containsKey(this.f13966OooO00o.get(i).f13968OooO00o.f12839OooO0o0)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final class OooO0O0 implements Player.OooO0OO, o0000O0.OooO00o, View.OnClickListener, PopupWindow.OnDismissListener {
        public OooO0O0() {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onAudioAttributesChanged(com.google.android.exoplayer2.audio.OooO00o oooO00o) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onAvailableCommandsChanged(Player.OooO00o oooO00o) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            Player player = styledPlayerControlView.f13937Oooooo;
            if (player == null) {
                return;
            }
            o0000 o0000Var = styledPlayerControlView.f13884OooO0Oo;
            o0000Var.OooO0oO();
            if (styledPlayerControlView.f13897OooOOo0 == view) {
                if (player.Oooo0O0(9)) {
                    player.OooOOO0();
                    return;
                }
                return;
            }
            if (styledPlayerControlView.f13895OooOOOo == view) {
                if (player.Oooo0O0(7)) {
                    player.OooO0oO();
                    return;
                }
                return;
            }
            if (styledPlayerControlView.f13898OooOOoo == view) {
                if (player.OooOOoo() == 4 || !player.Oooo0O0(12)) {
                    return;
                }
                player.OooOo();
                return;
            }
            if (styledPlayerControlView.f13901OooOo00 == view) {
                if (player.Oooo0O0(11)) {
                    player.OooOoO0();
                    return;
                }
                return;
            }
            if (styledPlayerControlView.f13896OooOOo == view) {
                if (o0O00.OoooO00(player)) {
                    o0O00.OooOooO(player);
                    return;
                } else {
                    o0O00.OooOoo(player);
                    return;
                }
            }
            if (styledPlayerControlView.f13903OooOo0o == view) {
                if (player.Oooo0O0(15)) {
                    player.Oooooo0(RepeatModeUtil.OooO00o(player.OooOo0(), styledPlayerControlView.f13948o00ooo));
                    return;
                }
                return;
            }
            if (styledPlayerControlView.f13899OooOo == view) {
                if (player.Oooo0O0(14)) {
                    player.OoooO00(!player.OooOo0O());
                    return;
                }
                return;
            }
            View view2 = styledPlayerControlView.f13907OooOoo;
            if (view2 == view) {
                o0000Var.OooO0o();
                styledPlayerControlView.OooO0o0(styledPlayerControlView.f13883OooO, view2);
                return;
            }
            View view3 = styledPlayerControlView.f13909OooOooO;
            if (view3 == view) {
                o0000Var.OooO0o();
                styledPlayerControlView.OooO0o0(styledPlayerControlView.f13889OooOO0, view3);
                return;
            }
            View view4 = styledPlayerControlView.f13910OooOooo;
            if (view4 == view) {
                o0000Var.OooO0o();
                styledPlayerControlView.OooO0o0(styledPlayerControlView.f13891OooOO0o, view4);
                return;
            }
            ImageView imageView = styledPlayerControlView.f13904OooOoO;
            if (imageView == view) {
                o0000Var.OooO0o();
                styledPlayerControlView.OooO0o0(styledPlayerControlView.f13890OooOO0O, imageView);
            }
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onCues(List list) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            if (styledPlayerControlView.f13952o0ooOoO) {
                styledPlayerControlView.f13884OooO0Oo.OooO0oO();
            }
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final void onEvents(Player player, Player.OooO0O0 oooO0O0) {
            boolean zOooO00o = oooO0O0.OooO00o(4, 5, 13);
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            if (zOooO00o) {
                float[] fArr = StyledPlayerControlView.f13882o0OOO0o;
                styledPlayerControlView.OooOOO0();
            }
            if (oooO0O0.OooO00o(4, 5, 7, 13)) {
                float[] fArr2 = StyledPlayerControlView.f13882o0OOO0o;
                styledPlayerControlView.OooOOOO();
            }
            if (oooO0O0.OooO00o(8, 13)) {
                float[] fArr3 = StyledPlayerControlView.f13882o0OOO0o;
                styledPlayerControlView.OooOOOo();
            }
            if (oooO0O0.OooO00o(9, 13)) {
                float[] fArr4 = StyledPlayerControlView.f13882o0OOO0o;
                styledPlayerControlView.OooOOo();
            }
            if (oooO0O0.OooO00o(8, 9, 11, 0, 16, 17, 13)) {
                float[] fArr5 = StyledPlayerControlView.f13882o0OOO0o;
                styledPlayerControlView.OooOO0o();
            }
            if (oooO0O0.OooO00o(11, 0, 13)) {
                float[] fArr6 = StyledPlayerControlView.f13882o0OOO0o;
                styledPlayerControlView.OooOOoo();
            }
            if (oooO0O0.OooO00o(12, 13)) {
                float[] fArr7 = StyledPlayerControlView.f13882o0OOO0o;
                styledPlayerControlView.OooOOO();
            }
            if (oooO0O0.OooO00o(2, 13)) {
                float[] fArr8 = StyledPlayerControlView.f13882o0OOO0o;
                styledPlayerControlView.OooOo00();
            }
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onIsLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onIsPlayingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onMediaItemTransition(com.google.android.exoplayer2.o000oOoO o000oooo2, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onMetadata(Metadata metadata) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onPlaybackParametersChanged(com.google.android.exoplayer2.o00Ooo o00ooo2) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onPlaybackStateChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onPlayerError(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onPositionDiscontinuity(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onRenderedFirstFrame() {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onRepeatModeChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.ui.o0000O0.OooO00o
        public final void onScrubMove(o0000O0 o0000o1, long j) {
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            TextView textView = styledPlayerControlView.f13914Oooo00O;
            if (textView != null) {
                textView.setText(o0O00.OooOo(styledPlayerControlView.f13912Oooo0, styledPlayerControlView.f13916Oooo0O0, j));
            }
        }

        @Override // com.google.android.exoplayer2.ui.o0000O0.OooO00o
        public final void onScrubStart(o0000O0 o0000o1, long j) {
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            styledPlayerControlView.f13943o00Oo0 = true;
            TextView textView = styledPlayerControlView.f13914Oooo00O;
            if (textView != null) {
                textView.setText(o0O00.OooOo(styledPlayerControlView.f13912Oooo0, styledPlayerControlView.f13916Oooo0O0, j));
            }
            styledPlayerControlView.f13884OooO0Oo.OooO0o();
        }

        @Override // com.google.android.exoplayer2.ui.o0000O0.OooO00o
        public final void onScrubStop(o0000O0 o0000o1, long j, boolean z) {
            Player player;
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            int i = 0;
            styledPlayerControlView.f13943o00Oo0 = false;
            if (!z && (player = styledPlayerControlView.f13937Oooooo) != null) {
                if (styledPlayerControlView.f13942o00O0O) {
                    if (player.Oooo0O0(17) && player.Oooo0O0(10)) {
                        com.google.android.exoplayer2.oo0o0Oo oo0o0ooOooOO0 = player.OooOO0();
                        int iOooOOOo = oo0o0ooOooOO0.OooOOOo();
                        while (true) {
                            long jOoooOO0 = o0O00.OoooOO0(oo0o0ooOooOO0.OooOOO(i, styledPlayerControlView.f13919Oooo0o0).f12941OooOOo0);
                            if (j < jOoooOO0) {
                                break;
                            }
                            if (i == iOooOOOo - 1) {
                                j = jOoooOO0;
                                break;
                            } else {
                                j -= jOoooOO0;
                                i++;
                            }
                        }
                        player.Oooo0oo(i, j);
                    }
                } else if (player.Oooo0O0(5)) {
                    player.OoooOoo(j);
                }
                styledPlayerControlView.OooOOOO();
            }
            styledPlayerControlView.f13884OooO0Oo.OooO0oO();
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onTimelineChanged(com.google.android.exoplayer2.oo0o0Oo oo0o0oo, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onTrackSelectionParametersChanged(com.google.android.exoplayer2.trackselection.OooO oooO) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onTracksChanged(com.google.android.exoplayer2.o0O0O00 o0o0o00) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onVideoSizeChanged(o0oOOo o0oooo) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onVolumeChanged(float f) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onCues(p230o00oOoO0.o0000O0O o0000o0o2) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onPositionDiscontinuity(Player.OooO0o oooO0o, Player.OooO0o oooO0o2, int i) {
        }
    }

    @Deprecated
    public interface OooO0OO {
    }

    public final class OooO0o extends RecyclerView.Adapter<SubSettingViewHolder> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String[] f13957OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float[] f13958OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f13959OooO0OO;

        public OooO0o(String[] strArr, float[] fArr) {
            this.f13957OooO00o = strArr;
            this.f13958OooO0O0 = fArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f13957OooO00o.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.o0O0O00 o0o0o00, final int i) {
            SubSettingViewHolder subSettingViewHolder = (SubSettingViewHolder) o0o0o00;
            String[] strArr = this.f13957OooO00o;
            if (i < strArr.length) {
                subSettingViewHolder.textView.setText(strArr[i]);
            }
            if (i == this.f13959OooO0OO) {
                subSettingViewHolder.itemView.setSelected(true);
                subSettingViewHolder.checkView.setVisibility(0);
            } else {
                subSettingViewHolder.itemView.setSelected(false);
                subSettingViewHolder.checkView.setVisibility(4);
            }
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.o0OOO0o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.OooO0o oooO0o = this.f14138OooO0Oo;
                    int i2 = oooO0o.f13959OooO0OO;
                    int i3 = i;
                    StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                    if (i3 != i2) {
                        styledPlayerControlView.setPlaybackSpeed(oooO0o.f13958OooO0O0[i3]);
                    }
                    styledPlayerControlView.f13892OooOOO.dismiss();
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(OooOo.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    public class OooOO0 extends RecyclerView.Adapter<SettingViewHolder> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String[] f13961OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String[] f13962OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Drawable[] f13963OooO0OO;

        public OooOO0(String[] strArr, Drawable[] drawableArr) {
            this.f13961OooO00o = strArr;
            this.f13962OooO0O0 = new String[strArr.length];
            this.f13963OooO0OO = drawableArr;
        }

        public final boolean OooO00o(int i) {
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            Player player = styledPlayerControlView.f13937Oooooo;
            if (player == null) {
                return false;
            }
            if (i == 0) {
                return player.Oooo0O0(13);
            }
            if (i != 1) {
                return true;
            }
            return player.Oooo0O0(30) && styledPlayerControlView.f13937Oooooo.Oooo0O0(29);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f13961OooO00o.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.o0O0O00 o0o0o00, int i) {
            SettingViewHolder settingViewHolder = (SettingViewHolder) o0o0o00;
            if (OooO00o(i)) {
                settingViewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                settingViewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
            }
            settingViewHolder.mainTextView.setText(this.f13961OooO00o[i]);
            String[] strArr = this.f13962OooO0O0;
            if (strArr[i] == null) {
                settingViewHolder.subTextView.setVisibility(8);
            } else {
                settingViewHolder.subTextView.setText(strArr[i]);
            }
            Drawable[] drawableArr = this.f13963OooO0OO;
            if (drawableArr[i] == null) {
                settingViewHolder.iconView.setVisibility(8);
            } else {
                settingViewHolder.iconView.setImageDrawable(drawableArr[i]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup viewGroup, int i) {
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            return styledPlayerControlView.new SettingViewHolder(LayoutInflater.from(styledPlayerControlView.getContext()).inflate(OooOo.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    public final class OooOO0O extends OooOOO {
        public OooOO0O() {
            super();
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.OooOOO, androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
            super.onBindViewHolder(subSettingViewHolder, i);
            if (i > 0) {
                OooOOO0 oooOOO0 = this.f13966OooO00o.get(i - 1);
                subSettingViewHolder.checkView.setVisibility(oooOOO0.f13968OooO00o.f12841OooO0oo[oooOOO0.f13969OooO0O0] ? 0 : 4);
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.OooOOO
        public final void OooO0O0(SubSettingViewHolder subSettingViewHolder) {
            int i;
            boolean z;
            subSettingViewHolder.textView.setText(Oooo0.exo_track_selection_none);
            int i2 = 0;
            while (true) {
                i = 1;
                if (i2 >= this.f13966OooO00o.size()) {
                    z = true;
                    break;
                }
                OooOOO0 oooOOO0 = this.f13966OooO00o.get(i2);
                if (oooOOO0.f13968OooO00o.f12841OooO0oo[oooOOO0.f13969OooO0O0]) {
                    z = false;
                    break;
                }
                i2++;
            }
            subSettingViewHolder.checkView.setVisibility(z ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new androidx.media3.ui.OooOOO(this, i));
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.OooOOO
        public final void OooO0OO(String str) {
        }

        public final void OooO0Oo(List<OooOOO0> list) {
            boolean z = false;
            for (int i = 0; i < ((com.google.common.collect.o0O00) list).f19538OooO0oO; i++) {
                OooOOO0 oooOOO0 = (OooOOO0) ((com.google.common.collect.o0O00) list).get(i);
                if (oooOOO0.f13968OooO00o.f12841OooO0oo[oooOOO0.f13969OooO0O0]) {
                    z = true;
                    break;
                }
            }
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            ImageView imageView = styledPlayerControlView.f13904OooOoO;
            if (imageView != null) {
                imageView.setImageDrawable(z ? styledPlayerControlView.f13930OoooOoO : styledPlayerControlView.f13931OoooOoo);
                styledPlayerControlView.f13904OooOoO.setContentDescription(z ? styledPlayerControlView.f13932Ooooo00 : styledPlayerControlView.f13933Ooooo0o);
            }
            this.f13966OooO00o = list;
        }
    }

    public abstract class OooOOO extends RecyclerView.Adapter<SubSettingViewHolder> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public List<OooOOO0> f13966OooO00o = new ArrayList();

        public OooOOO() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OooO00o */
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
            final Player player = StyledPlayerControlView.this.f13937Oooooo;
            if (player == null) {
                return;
            }
            if (i == 0) {
                OooO0O0(subSettingViewHolder);
                return;
            }
            final OooOOO0 oooOOO0 = this.f13966OooO00o.get(i - 1);
            final o000O00O o000o00o2 = oooOOO0.f13968OooO00o.f12839OooO0o0;
            boolean z = player.OooOO0o().f13571OooOoo0.get(o000o00o2) != null && oooOOO0.f13968OooO00o.f12841OooO0oo[oooOOO0.f13969OooO0O0];
            subSettingViewHolder.textView.setText(oooOOO0.f13970OooO0OO);
            subSettingViewHolder.checkView.setVisibility(z ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.o0OO00O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.OooOOO oooOOO = this.f14134OooO0Oo;
                    oooOOO.getClass();
                    Player player2 = player;
                    if (player2.Oooo0O0(29)) {
                        com.google.android.exoplayer2.trackselection.OooO.OooO00o OooO00o2 = player2.OooOO0o().OooO00o();
                        StyledPlayerControlView.OooOOO0 oooOOO1 = oooOOO0;
                        player2.OooooOO(OooO00o2.OooO0o0(new o0O0ooO(o000o00o2, ImmutableList.OooOOOo(Integer.valueOf(oooOOO1.f13969OooO0O0)))).OooO0o(oooOOO1.f13968OooO00o.f12839OooO0o0.f39874OooO0o).OooO00o());
                        oooOOO.OooO0OO(oooOOO1.f13970OooO0OO);
                        StyledPlayerControlView.this.f13892OooOOO.dismiss();
                    }
                }
            });
        }

        public abstract void OooO0O0(SubSettingViewHolder subSettingViewHolder);

        public abstract void OooO0OO(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            if (this.f13966OooO00o.isEmpty()) {
                return 0;
            }
            return this.f13966OooO00o.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(OooOo.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    public static final class OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.google.android.exoplayer2.o0O0O00.OooO00o f13968OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f13969OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f13970OooO0OO;

        public OooOOO0(com.google.android.exoplayer2.o0O0O00 o0o0o00, int i, int i2, String str) {
            this.f13968OooO00o = o0o0o00.OooO00o().get(i);
            this.f13969OooO0O0 = i2;
            this.f13970OooO0OO = str;
        }
    }

    @Deprecated
    public interface OooOOOO {
        void OooO00o(int i);
    }

    public final class SettingViewHolder extends RecyclerView.o0O0O00 {
        private final ImageView iconView;
        private final TextView mainTextView;
        private final TextView subTextView;

        public SettingViewHolder(View view) {
            super(view);
            if (o0O00.f40595OooO00o < 26) {
                view.setFocusable(true);
            }
            this.mainTextView = (TextView) view.findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_main_text);
            this.subTextView = (TextView) view.findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_sub_text);
            this.iconView = (ImageView) view.findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_icon);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.o0Oo0oo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f14140OooO0Oo.lambda$new$0(view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$new$0(View view) {
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            int adapterPosition = getAdapterPosition();
            View view2 = styledPlayerControlView.f13907OooOoo;
            if (adapterPosition == 0) {
                view2.getClass();
                styledPlayerControlView.OooO0o0(styledPlayerControlView.f13889OooOO0, view2);
            } else if (adapterPosition != 1) {
                styledPlayerControlView.f13892OooOOO.dismiss();
            } else {
                view2.getClass();
                styledPlayerControlView.OooO0o0(styledPlayerControlView.f13891OooOO0o, view2);
            }
        }
    }

    public static class SubSettingViewHolder extends RecyclerView.o0O0O00 {
        public final View checkView;
        public final TextView textView;

        public SubSettingViewHolder(View view) {
            super(view);
            if (o0O00.f40595OooO00o < 26) {
                view.setFocusable(true);
            }
            this.textView = (TextView) view.findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_text);
            this.checkView = view.findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_check);
        }
    }

    static {
        o00OOO0.OooO00o("goog.exo.ui");
        f13882o0OOO0o = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public StyledPlayerControlView(Context context) {
        this(context, null);
    }

    public static void OooO00o(StyledPlayerControlView styledPlayerControlView) {
        if (styledPlayerControlView.f13939OoooooO == null) {
            return;
        }
        boolean z = !styledPlayerControlView.f13940Ooooooo;
        styledPlayerControlView.f13940Ooooooo = z;
        String str = styledPlayerControlView.f13936OooooOo;
        Drawable drawable = styledPlayerControlView.f13934OooooO0;
        String str2 = styledPlayerControlView.f13938Oooooo0;
        Drawable drawable2 = styledPlayerControlView.f13935OooooOO;
        ImageView imageView = styledPlayerControlView.f13906OooOoOO;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            }
        }
        boolean z2 = styledPlayerControlView.f13940Ooooooo;
        ImageView imageView2 = styledPlayerControlView.f13908OooOoo0;
        if (imageView2 != null) {
            if (z2) {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            } else {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            }
        }
        OooO0OO oooO0OO = styledPlayerControlView.f13939OoooooO;
        if (oooO0OO != null) {
            StyledPlayerView.this.getClass();
        }
    }

    public static boolean OooO0OO(Player player, com.google.android.exoplayer2.oo0o0Oo.OooO0OO oooO0OO) {
        com.google.android.exoplayer2.oo0o0Oo oo0o0ooOooOO0;
        int iOooOOOo;
        if (!player.Oooo0O0(17) || (iOooOOOo = (oo0o0ooOooOO0 = player.OooOO0()).OooOOOo()) <= 1 || iOooOOOo > 100) {
            return false;
        }
        for (int i = 0; i < iOooOOOo; i++) {
            if (oo0o0ooOooOO0.OooOOO(i, oooO0OO).f12941OooOOo0 == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        Player player = this.f13937Oooooo;
        if (player == null || !player.Oooo0O0(13)) {
            return;
        }
        Player player2 = this.f13937Oooooo;
        player2.OooO0o0(new com.google.android.exoplayer2.o00Ooo(f, player2.OooO00o().f12829OooO0o0));
    }

    public final boolean OooO() {
        return getVisibility() == 0;
    }

    public final boolean OooO0Oo(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.f13937Oooooo;
        if (player != null) {
            if (keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode == 90) {
                        if (player.OooOOoo() != 4 && player.Oooo0O0(12)) {
                            player.OooOo();
                        }
                    } else if (keyCode == 89 && player.Oooo0O0(11)) {
                        player.OooOoO0();
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode == 79 || keyCode == 85) {
                            if (o0O00.OoooO00(player)) {
                                o0O00.OooOooO(player);
                            } else {
                                o0O00.OooOoo(player);
                            }
                        } else if (keyCode != 87) {
                            if (keyCode != 88) {
                                if (keyCode == 126) {
                                    o0O00.OooOooO(player);
                                } else if (keyCode == 127) {
                                    o0O00.OooOoo(player);
                                }
                            } else if (player.Oooo0O0(7)) {
                                player.OooO0oO();
                            }
                        } else if (player.Oooo0O0(9)) {
                            player.OooOOO0();
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final com.google.common.collect.o0O00 OooO0o(com.google.android.exoplayer2.o0O0O00 o0o0o00, int i) {
        ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
        ImmutableList<com.google.android.exoplayer2.o0O0O00.OooO00o> immutableList = o0o0o00.f12832OooO0Oo;
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            com.google.android.exoplayer2.o0O0O00.OooO00o oooO00o2 = immutableList.get(i2);
            if (oooO00o2.f12839OooO0o0.f39874OooO0o == i) {
                for (int i3 = 0; i3 < oooO00o2.f12837OooO0Oo; i3++) {
                    if (oooO00o2.OooO0Oo(i3)) {
                        com.google.android.exoplayer2.OooOo oooOo = oooO00o2.f12839OooO0o0.f39876OooO0oO[i3];
                        if ((oooOo.f11204OooO0oO & 2) == 0) {
                            oooO00o.OooO0OO(new OooOOO0(o0o0o00, i2, i3, this.f13893OooOOO0.OooO00o(oooOo)));
                        }
                    }
                }
            }
        }
        return oooO00o.OooO0oo();
    }

    public final void OooO0o0(RecyclerView.Adapter<?> adapter, View view) {
        this.f13888OooO0oo.setAdapter(adapter);
        OooOOo0();
        this.f13952o0ooOoO = false;
        PopupWindow popupWindow = this.f13892OooOOO;
        popupWindow.dismiss();
        this.f13952o0ooOoO = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.f13894OooOOOO;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    public final void OooO0oO() {
        o0000 o0000Var = this.f13884OooO0Oo;
        int i = o0000Var.f14057OooOoO;
        if (i == 3 || i == 2) {
            return;
        }
        o0000Var.OooO0o();
        if (!o0000Var.f14060OooOoo) {
            o0000Var.OooO(2);
        } else if (o0000Var.f14057OooOoO == 1) {
            o0000Var.f14046OooOOO0.start();
        } else {
            o0000Var.f14045OooOOO.start();
        }
    }

    public final boolean OooO0oo() {
        o0000 o0000Var = this.f13884OooO0Oo;
        return o0000Var.f14057OooOoO == 0 && o0000Var.f14034OooO00o.OooO();
    }

    public final void OooOO0() {
        OooOOO0();
        OooOO0o();
        OooOOOo();
        OooOOo();
        OooOo00();
        OooOOO();
        OooOOoo();
    }

    public final void OooOO0O(@Nullable View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.f13941o000oOoO : this.f13927OoooOOO);
    }

    public final void OooOO0o() {
        boolean zOooo0O0;
        boolean zOooo0O1;
        boolean zOooo0O2;
        boolean zOooo0O3;
        boolean zOooo0O4;
        if (OooO() && this.f13949o0OoOo0) {
            Player player = this.f13937Oooooo;
            if (player != null) {
                zOooo0O1 = (this.f13954ooOO && OooO0OO(player, this.f13919Oooo0o0)) ? player.Oooo0O0(10) : player.Oooo0O0(5);
                zOooo0O2 = player.Oooo0O0(7);
                zOooo0O3 = player.Oooo0O0(11);
                zOooo0O4 = player.Oooo0O0(12);
                zOooo0O0 = player.Oooo0O0(9);
            } else {
                zOooo0O0 = false;
                zOooo0O1 = false;
                zOooo0O2 = false;
                zOooo0O3 = false;
                zOooo0O4 = false;
            }
            Resources resources = this.f13886OooO0o0;
            View view = this.f13901OooOo00;
            if (zOooo0O3) {
                Player player2 = this.f13937Oooooo;
                int iOooOoO = (int) ((player2 != null ? player2.OooOoO() : 5000L) / 1000);
                TextView textView = this.f13902OooOo0O;
                if (textView != null) {
                    textView.setText(String.valueOf(iOooOoO));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(Oooo000.exo_controls_rewind_by_amount_description, iOooOoO, Integer.valueOf(iOooOoO)));
                }
            }
            View view2 = this.f13898OooOOoo;
            if (zOooo0O4) {
                Player player3 = this.f13937Oooooo;
                int iOooOOo0 = (int) ((player3 != null ? player3.OooOOo0() : 15000L) / 1000);
                TextView textView2 = this.f13900OooOo0;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iOooOOo0));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(Oooo000.exo_controls_fastforward_by_amount_description, iOooOOo0, Integer.valueOf(iOooOOo0)));
                }
            }
            OooOO0O(this.f13895OooOOOo, zOooo0O2);
            OooOO0O(view, zOooo0O3);
            OooOO0O(view2, zOooo0O4);
            OooOO0O(this.f13897OooOOo0, zOooo0O0);
            o0000O0 o0000o1 = this.f13915Oooo00o;
            if (o0000o1 != null) {
                o0000o1.setEnabled(zOooo0O1);
            }
        }
    }

    public final void OooOOO() {
        OooO0o oooO0o;
        Player player = this.f13937Oooooo;
        if (player == null) {
            return;
        }
        float f = player.OooO00o().f12827OooO0Oo;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            oooO0o = this.f13889OooOO0;
            float[] fArr = oooO0o.f13958OooO0O0;
            if (i >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs < f2) {
                i2 = i;
                f2 = fAbs;
            }
            i++;
        }
        oooO0o.f13959OooO0OO = i2;
        String str = oooO0o.f13957OooO00o[i2];
        OooOO0 oooOO1 = this.f13883OooO;
        oooOO1.f13962OooO0O0[0] = str;
        OooOO0O(this.f13907OooOoo, oooOO1.OooO00o(1) || oooOO1.OooO00o(0));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    public final void OooOOO0() {
        View view;
        boolean z;
        if (OooO() && this.f13949o0OoOo0 && (view = this.f13896OooOOo) != null) {
            boolean zOoooO00 = o0O00.OoooO00(this.f13937Oooooo);
            int i = zOoooO00 ? com.google.android.exoplayer2.ui.OooOOO0.exo_styled_controls_play : com.google.android.exoplayer2.ui.OooOOO0.exo_styled_controls_pause;
            int i2 = zOoooO00 ? Oooo0.exo_controls_play_description : Oooo0.exo_controls_pause_description;
            Context context = getContext();
            Resources resources = this.f13886OooO0o0;
            ((ImageView) view).setImageDrawable(o0O00.OooOOOO(context, resources, i));
            view.setContentDescription(resources.getString(i2));
            Player player = this.f13937Oooooo;
            if (player != null) {
                z = true;
                if (!player.Oooo0O0(1) || (this.f13937Oooooo.Oooo0O0(17) && this.f13937Oooooo.OooOO0().OooOOo0())) {
                    z = false;
                }
            } else {
                z = false;
            }
            OooOO0O(view, z);
        }
    }

    public final void OooOOOO() {
        long jOooOOo;
        long jOooOo0o;
        if (OooO() && this.f13949o0OoOo0) {
            Player player = this.f13937Oooooo;
            if (player == null || !player.Oooo0O0(16)) {
                jOooOOo = 0;
                jOooOo0o = 0;
            } else {
                jOooOOo = player.OooOOo() + this.f13951o0ooOOo;
                jOooOo0o = player.OooOo0o() + this.f13951o0ooOOo;
            }
            TextView textView = this.f13914Oooo00O;
            if (textView != null && !this.f13943o00Oo0) {
                textView.setText(o0O00.OooOo(this.f13912Oooo0, this.f13916Oooo0O0, jOooOOo));
            }
            o0000O0 o0000o1 = this.f13915Oooo00o;
            if (o0000o1 != null) {
                o0000o1.setPosition(jOooOOo);
                o0000o1.setBufferedPosition(jOooOo0o);
            }
            o0O0OO0 o0o0oo0 = this.f13918Oooo0o;
            removeCallbacks(o0o0oo0);
            int iOooOOoo = player == null ? 1 : player.OooOOoo();
            if (player != null && player.isPlaying()) {
                long jMin = Math.min(o0000o1 != null ? o0000o1.getPreferredUpdateDelay() : 1000L, 1000 - (jOooOOo % 1000));
                float f = player.OooO00o().f12827OooO0Oo;
                postDelayed(o0o0oo0, o0O00.OooOO0(f > 0.0f ? (long) (jMin / f) : 1000L, this.f13945o00o0O, 1000L));
            } else {
                if (iOooOOoo == 4 || iOooOOoo == 1) {
                    return;
                }
                postDelayed(o0o0oo0, 1000L);
            }
        }
    }

    public final void OooOOOo() {
        ImageView imageView;
        if (OooO() && this.f13949o0OoOo0 && (imageView = this.f13903OooOo0o) != null) {
            if (this.f13948o00ooo == 0) {
                OooOO0O(imageView, false);
                return;
            }
            Player player = this.f13937Oooooo;
            String str = this.f13924OoooO00;
            Drawable drawable = this.f13920Oooo0oO;
            if (player == null || !player.Oooo0O0(15)) {
                OooOO0O(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            OooOO0O(imageView, true);
            int iOooOo0 = player.OooOo0();
            if (iOooOo0 == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iOooOo0 == 1) {
                imageView.setImageDrawable(this.f13921Oooo0oo);
                imageView.setContentDescription(this.f13923OoooO0);
            } else {
                if (iOooOo0 != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f13911Oooo);
                imageView.setContentDescription(this.f13925OoooO0O);
            }
        }
    }

    public final void OooOOo() {
        ImageView imageView;
        if (OooO() && this.f13949o0OoOo0 && (imageView = this.f13899OooOo) != null) {
            Player player = this.f13937Oooooo;
            if (!this.f13884OooO0Oo.OooO0OO(imageView)) {
                OooOO0O(imageView, false);
                return;
            }
            String str = this.f13929OoooOo0;
            Drawable drawable = this.f13926OoooOO0;
            if (player == null || !player.Oooo0O0(14)) {
                OooOO0O(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            OooOO0O(imageView, true);
            if (player.OooOo0O()) {
                drawable = this.f13922OoooO;
            }
            imageView.setImageDrawable(drawable);
            if (player.OooOo0O()) {
                str = this.f13928OoooOOo;
            }
            imageView.setContentDescription(str);
        }
    }

    public final void OooOOo0() {
        RecyclerView recyclerView = this.f13888OooO0oo;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.f13894OooOOOO;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.f13892OooOOO;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0152  */
    public final void OooOOoo() {
        long jOooo0O0;
        long j;
        int i;
        com.google.android.exoplayer2.oo0o0Oo oo0o0oo;
        com.google.android.exoplayer2.oo0o0Oo oo0o0oo2;
        boolean z;
        boolean z2;
        Player player = this.f13937Oooooo;
        if (player == null) {
            return;
        }
        boolean z3 = this.f13954ooOO;
        boolean z4 = true;
        com.google.android.exoplayer2.oo0o0Oo.OooO0OO oooO0OO = this.f13919Oooo0o0;
        this.f13942o00O0O = z3 && OooO0OO(player, oooO0OO);
        this.f13951o0ooOOo = 0L;
        com.google.android.exoplayer2.oo0o0Oo oo0o0ooOooOO0 = player.Oooo0O0(17) ? player.OooOO0() : com.google.android.exoplayer2.oo0o0Oo.f12895OooO0Oo;
        long j2 = -9223372036854775807L;
        if (oo0o0ooOooOO0.OooOOo0()) {
            if (player.Oooo0O0(16)) {
                long jOooOOOO = player.OooOOOO();
                if (jOooOOOO != -9223372036854775807L) {
                    jOooo0O0 = o0O00.Oooo0O0(jOooOOOO);
                } else {
                    jOooo0O0 = 0;
                }
            } else {
                jOooo0O0 = 0;
            }
            j = jOooo0O0;
            i = 0;
        } else {
            int iOooOo00 = player.OooOo00();
            boolean z5 = this.f13942o00O0O;
            int i2 = z5 ? 0 : iOooOo00;
            int iOooOOOo = z5 ? oo0o0ooOooOO0.OooOOOo() - 1 : iOooOo00;
            j = 0;
            i = 0;
            while (i2 <= iOooOOOo) {
                if (i2 == iOooOo00) {
                    this.f13951o0ooOOo = o0O00.OoooOO0(j);
                }
                oo0o0ooOooOO0.OooOOO(i2, oooO0OO);
                if (oooO0OO.f12941OooOOo0 == j2) {
                    o00O000o.OooO0Oo(this.f13942o00O0O ^ z4);
                    break;
                }
                int i3 = oooO0OO.f12940OooOOo;
                while (i3 <= oooO0OO.f12942OooOOoo) {
                    com.google.android.exoplayer2.oo0o0Oo.OooO0O0 oooO0O0 = this.f13917Oooo0OO;
                    oo0o0ooOooOO0.OooO0o(i3, oooO0O0);
                    AdPlaybackState adPlaybackState = oooO0O0.f12910OooOO0;
                    int i4 = adPlaybackState.f13137OooO0oo;
                    while (i4 < adPlaybackState.f13135OooO0o0) {
                        long jOooO0Oo = oooO0O0.OooO0Oo(i4);
                        int i5 = iOooOo00;
                        if (jOooO0Oo == Long.MIN_VALUE) {
                            oo0o0oo = oo0o0ooOooOO0;
                            long j3 = oooO0O0.f12908OooO0oO;
                            if (j3 == j2) {
                                oo0o0oo2 = oo0o0oo;
                            } else {
                                jOooO0Oo = j3;
                            }
                            i4++;
                            iOooOo00 = i5;
                            oo0o0ooOooOO0 = oo0o0oo2;
                            j2 = -9223372036854775807L;
                        } else {
                            oo0o0oo = oo0o0ooOooOO0;
                        }
                        long j4 = jOooO0Oo + oooO0O0.f12909OooO0oo;
                        if (j4 >= 0) {
                            long[] jArr = this.f13953oo000o;
                            if (i == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.f13953oo000o = Arrays.copyOf(jArr, length);
                                this.f13947o00oO0o = Arrays.copyOf(this.f13947o00oO0o, length);
                            }
                            this.f13953oo000o[i] = o0O00.OoooOO0(j + j4);
                            boolean[] zArr = this.f13947o00oO0o;
                            AdPlaybackState.OooO00o OooO00o2 = oooO0O0.f12910OooOO0.OooO00o(i4);
                            int i6 = OooO00o2.f13150OooO0o0;
                            if (i6 == -1) {
                                oo0o0oo2 = oo0o0oo;
                            } else {
                                int i7 = 0;
                                while (true) {
                                    oo0o0oo2 = oo0o0oo;
                                    if (i7 < i6) {
                                        int i8 = OooO00o2.f13152OooO0oo[i7];
                                        if (i8 != 0) {
                                            AdPlaybackState.OooO00o oooO00o = OooO00o2;
                                            z = true;
                                            if (i8 != 1) {
                                                i7++;
                                                oo0o0oo = oo0o0oo2;
                                                OooO00o2 = oooO00o;
                                            }
                                        }
                                        z2 = z;
                                    } else {
                                        z = true;
                                        z2 = false;
                                    }
                                    zArr[i] = z2 ^ z;
                                    i++;
                                }
                            }
                            z = true;
                            z2 = z;
                            zArr[i] = z2 ^ z;
                            i++;
                        } else {
                            oo0o0oo2 = oo0o0oo;
                        }
                        i4++;
                        iOooOo00 = i5;
                        oo0o0ooOooOO0 = oo0o0oo2;
                        j2 = -9223372036854775807L;
                    }
                    i3++;
                    z4 = true;
                    oo0o0ooOooOO0 = oo0o0ooOooOO0;
                    j2 = -9223372036854775807L;
                }
                j += oooO0OO.f12941OooOOo0;
                i2++;
                z4 = z4;
                oo0o0ooOooOO0 = oo0o0ooOooOO0;
                j2 = -9223372036854775807L;
            }
        }
        long jOoooOO0 = o0O00.OoooOO0(j);
        TextView textView = this.f13913Oooo000;
        if (textView != null) {
            textView.setText(o0O00.OooOo(this.f13912Oooo0, this.f13916Oooo0O0, jOoooOO0));
        }
        o0000O0 o0000o1 = this.f13915Oooo00o;
        if (o0000o1 != null) {
            o0000o1.setDuration(jOoooOO0);
            long[] jArr2 = this.f13946o00oO0O;
            int length2 = jArr2.length;
            int i9 = i + length2;
            long[] jArr3 = this.f13953oo000o;
            if (i9 > jArr3.length) {
                this.f13953oo000o = Arrays.copyOf(jArr3, i9);
                this.f13947o00oO0o = Arrays.copyOf(this.f13947o00oO0o, i9);
            }
            System.arraycopy(jArr2, 0, this.f13953oo000o, i, length2);
            System.arraycopy(this.f13950o0ooOO0, 0, this.f13947o00oO0o, i, length2);
            o0000o1.OooO00o(this.f13953oo000o, this.f13947o00oO0o, i9);
        }
        OooOOOO();
    }

    public final void OooOo00() {
        OooOO0O oooOO0O = this.f13890OooOO0O;
        oooOO0O.getClass();
        oooOO0O.f13966OooO00o = Collections.emptyList();
        OooO00o oooO00o = this.f13891OooOO0o;
        oooO00o.getClass();
        oooO00o.f13966OooO00o = Collections.emptyList();
        Player player = this.f13937Oooooo;
        ImageView imageView = this.f13904OooOoO;
        if (player != null && player.Oooo0O0(30) && this.f13937Oooooo.Oooo0O0(29)) {
            com.google.android.exoplayer2.o0O0O00 o0o0o00OooO0oo = this.f13937Oooooo.OooO0oo();
            com.google.common.collect.o0O00 o0o00OooO0o = OooO0o(o0o0o00OooO0oo, 1);
            oooO00o.f13966OooO00o = o0o00OooO0o;
            StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
            Player player2 = styledPlayerControlView.f13937Oooooo;
            player2.getClass();
            com.google.android.exoplayer2.trackselection.OooO oooOOooOO0o = player2.OooOO0o();
            boolean zIsEmpty = o0o00OooO0o.isEmpty();
            OooOO0 oooOO1 = styledPlayerControlView.f13883OooO;
            if (zIsEmpty) {
                oooOO1.f13962OooO0O0[1] = styledPlayerControlView.getResources().getString(Oooo0.exo_track_selection_none);
            } else if (oooO00o.OooO0Oo(oooOOooOO0o)) {
                for (int i = 0; i < o0o00OooO0o.f19538OooO0oO; i++) {
                    OooOOO0 oooOOO0 = (OooOOO0) o0o00OooO0o.get(i);
                    if (oooOOO0.f13968OooO00o.f12841OooO0oo[oooOOO0.f13969OooO0O0]) {
                        oooOO1.f13962OooO0O0[1] = oooOOO0.f13970OooO0OO;
                        break;
                    }
                }
            } else {
                oooOO1.f13962OooO0O0[1] = styledPlayerControlView.getResources().getString(Oooo0.exo_track_selection_auto);
            }
            if (this.f13884OooO0Oo.OooO0OO(imageView)) {
                oooOO0O.OooO0Oo(OooO0o(o0o0o00OooO0oo, 3));
            } else {
                oooOO0O.OooO0Oo(com.google.common.collect.o0O00.f19536OooO0oo);
            }
        }
        OooOO0O(imageView, oooOO0O.getItemCount() > 0);
        OooOO0 oooOO2 = this.f13883OooO;
        OooOO0O(this.f13907OooOoo, oooOO2.OooO00o(1) || oooOO2.OooO00o(0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return OooO0Oo(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Nullable
    public Player getPlayer() {
        return this.f13937Oooooo;
    }

    public int getRepeatToggleModes() {
        return this.f13948o00ooo;
    }

    public boolean getShowShuffleButton() {
        return this.f13884OooO0Oo.OooO0OO(this.f13899OooOo);
    }

    public boolean getShowSubtitleButton() {
        return this.f13884OooO0Oo.OooO0OO(this.f13904OooOoO);
    }

    public int getShowTimeoutMs() {
        return this.f13944o00Ooo;
    }

    public boolean getShowVrButton() {
        return this.f13884OooO0Oo.OooO0OO(this.f13905OooOoO0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o0000 o0000Var = this.f13884OooO0Oo;
        o0000Var.f14034OooO00o.addOnLayoutChangeListener(o0000Var.f14052OooOo);
        this.f13949o0OoOo0 = true;
        if (OooO0oo()) {
            o0000Var.OooO0oO();
        }
        OooOO0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o0000 o0000Var = this.f13884OooO0Oo;
        o0000Var.f14034OooO00o.removeOnLayoutChangeListener(o0000Var.f14052OooOo);
        this.f13949o0OoOo0 = false;
        removeCallbacks(this.f13918Oooo0o);
        o0000Var.OooO0o();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f13884OooO0Oo.f14035OooO0O0;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.f13884OooO0Oo.f14060OooOoo = z;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@Nullable OooO0OO oooO0OO) {
        this.f13939OoooooO = oooO0OO;
        boolean z = oooO0OO != null;
        ImageView imageView = this.f13906OooOoOO;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = oooO0OO != null;
        ImageView imageView2 = this.f13908OooOoo0;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(@Nullable Player player) {
        boolean z = true;
        o00O000o.OooO0Oo(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.OooOO0O() != Looper.getMainLooper()) {
            z = false;
        }
        o00O000o.OooO00o(z);
        Player player2 = this.f13937Oooooo;
        if (player2 == player) {
            return;
        }
        OooO0O0 oooO0O0 = this.f13885OooO0o;
        if (player2 != null) {
            player2.OooOooo(oooO0O0);
        }
        this.f13937Oooooo = player;
        if (player != null) {
            player.Ooooo00(oooO0O0);
        }
        OooOO0();
    }

    public void setProgressUpdateListener(@Nullable OooO oooO) {
    }

    public void setRepeatToggleModes(int i) {
        this.f13948o00ooo = i;
        Player player = this.f13937Oooooo;
        if (player != null && player.Oooo0O0(15)) {
            int iOooOo0 = this.f13937Oooooo.OooOo0();
            if (i == 0 && iOooOo0 != 0) {
                this.f13937Oooooo.Oooooo0(0);
            } else if (i == 1 && iOooOo0 == 2) {
                this.f13937Oooooo.Oooooo0(1);
            } else if (i == 2 && iOooOo0 == 1) {
                this.f13937Oooooo.Oooooo0(2);
            }
        }
        this.f13884OooO0Oo.OooO0oo(this.f13903OooOo0o, i != 0);
        OooOOOo();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f13884OooO0Oo.OooO0oo(this.f13898OooOOoo, z);
        OooOO0o();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f13954ooOO = z;
        OooOOoo();
    }

    public void setShowNextButton(boolean z) {
        this.f13884OooO0Oo.OooO0oo(this.f13897OooOOo0, z);
        OooOO0o();
    }

    public void setShowPreviousButton(boolean z) {
        this.f13884OooO0Oo.OooO0oo(this.f13895OooOOOo, z);
        OooOO0o();
    }

    public void setShowRewindButton(boolean z) {
        this.f13884OooO0Oo.OooO0oo(this.f13901OooOo00, z);
        OooOO0o();
    }

    public void setShowShuffleButton(boolean z) {
        this.f13884OooO0Oo.OooO0oo(this.f13899OooOo, z);
        OooOOo();
    }

    public void setShowSubtitleButton(boolean z) {
        this.f13884OooO0Oo.OooO0oo(this.f13904OooOoO, z);
    }

    public void setShowTimeoutMs(int i) {
        this.f13944o00Ooo = i;
        if (OooO0oo()) {
            this.f13884OooO0Oo.OooO0oO();
        }
    }

    public void setShowVrButton(boolean z) {
        this.f13884OooO0Oo.OooO0oo(this.f13905OooOoO0, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f13945o00o0O = o0O00.OooO(i, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.f13905OooOoO0;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            OooOO0O(view, onClickListener != null);
        }
    }

    public StyledPlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StyledPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public StyledPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        super(context, attributeSet, i);
        int resourceId = OooOo.exo_styled_player_control_view;
        this.f13944o00Ooo = 5000;
        this.f13948o00ooo = 0;
        this.f13945o00o0O = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, o0OoOo0.StyledPlayerControlView, i, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(o0OoOo0.StyledPlayerControlView_controller_layout_id, resourceId);
                this.f13944o00Ooo = typedArrayObtainStyledAttributes.getInt(o0OoOo0.StyledPlayerControlView_show_timeout, this.f13944o00Ooo);
                this.f13948o00ooo = typedArrayObtainStyledAttributes.getInt(o0OoOo0.StyledPlayerControlView_repeat_toggle_modes, this.f13948o00ooo);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.StyledPlayerControlView_show_rewind_button, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.StyledPlayerControlView_show_fastforward_button, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.StyledPlayerControlView_show_previous_button, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.StyledPlayerControlView_show_next_button, true);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.StyledPlayerControlView_show_shuffle_button, false);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.StyledPlayerControlView_show_subtitle_button, false);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.StyledPlayerControlView_show_vr_button, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(o0OoOo0.StyledPlayerControlView_time_bar_min_update_interval, this.f13945o00o0O));
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.StyledPlayerControlView_animation_enabled, true);
                typedArrayObtainStyledAttributes.recycle();
                z3 = z15;
                z7 = z12;
                z = z16;
                z8 = z13;
                z5 = z10;
                z6 = z11;
                z4 = z17;
                z2 = z14;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = true;
            z5 = true;
            z6 = true;
            z7 = true;
            z8 = true;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f13885OooO0o = oooO0O0;
        this.f13887OooO0oO = new CopyOnWriteArrayList<>();
        this.f13917Oooo0OO = new com.google.android.exoplayer2.oo0o0Oo.OooO0O0();
        this.f13919Oooo0o0 = new com.google.android.exoplayer2.oo0o0Oo.OooO0OO();
        StringBuilder sb = new StringBuilder();
        this.f13912Oooo0 = sb;
        this.f13916Oooo0O0 = new Formatter(sb, Locale.getDefault());
        this.f13953oo000o = new long[0];
        this.f13947o00oO0o = new boolean[0];
        this.f13946o00oO0O = new long[0];
        this.f13950o0ooOO0 = new boolean[0];
        this.f13918Oooo0o = new o0O0OO0(this, 2);
        this.f13913Oooo000 = (TextView) findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_duration);
        this.f13914Oooo00O = (TextView) findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_position);
        ImageView imageView = (ImageView) findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_subtitle);
        this.f13904OooOoO = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(oooO0O0);
        }
        ImageView imageView2 = (ImageView) findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_fullscreen);
        this.f13906OooOoOO = imageView2;
        oo000o oo000oVar = new oo000o(this, 0);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(oo000oVar);
        }
        ImageView imageView3 = (ImageView) findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_minimal_fullscreen);
        this.f13908OooOoo0 = imageView3;
        o00oO0o o00oo0o2 = new o00oO0o(this, 0);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(o00oo0o2);
        }
        View viewFindViewById = findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_settings);
        this.f13907OooOoo = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(oooO0O0);
        }
        View viewFindViewById2 = findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_playback_speed);
        this.f13909OooOooO = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(oooO0O0);
        }
        View viewFindViewById3 = findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_audio_track);
        this.f13910OooOooo = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(oooO0O0);
        }
        int i2 = com.google.android.exoplayer2.ui.OooOOOO.exo_progress;
        o0000O0 o0000o1 = (o0000O0) findViewById(i2);
        View viewFindViewById4 = findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_progress_placeholder);
        if (o0000o1 != null) {
            this.f13915Oooo00o = o0000o1;
        } else if (viewFindViewById4 != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, o000oOoO.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(i2);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f13915Oooo00o = defaultTimeBar;
        } else {
            this.f13915Oooo00o = null;
        }
        o0000O0 o0000o2 = this.f13915Oooo00o;
        if (o0000o2 != null) {
            o0000o2.OooO0O0(oooO0O0);
        }
        View viewFindViewById5 = findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_play_pause);
        this.f13896OooOOo = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(oooO0O0);
        }
        View viewFindViewById6 = findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_prev);
        this.f13895OooOOOo = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(oooO0O0);
        }
        View viewFindViewById7 = findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_next);
        this.f13897OooOOo0 = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(oooO0O0);
        }
        Typeface typefaceOooO0O0 = androidx.core.content.res.OooO00o.OooO0O0(com.google.android.exoplayer2.ui.OooOOO.roboto_medium_numbers, context);
        View viewFindViewById8 = findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_rew);
        TextView textView = viewFindViewById8 == null ? (TextView) findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_rew_with_amount) : null;
        this.f13902OooOo0O = textView;
        if (textView != null) {
            textView.setTypeface(typefaceOooO0O0);
        }
        viewFindViewById8 = viewFindViewById8 == null ? textView : viewFindViewById8;
        this.f13901OooOo00 = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setOnClickListener(oooO0O0);
        }
        View viewFindViewById9 = findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_ffwd);
        TextView textView2 = viewFindViewById9 == null ? (TextView) findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_ffwd_with_amount) : null;
        this.f13900OooOo0 = textView2;
        if (textView2 != null) {
            textView2.setTypeface(typefaceOooO0O0);
        }
        viewFindViewById9 = viewFindViewById9 == null ? textView2 : viewFindViewById9;
        this.f13898OooOOoo = viewFindViewById9;
        if (viewFindViewById9 != null) {
            viewFindViewById9.setOnClickListener(oooO0O0);
        }
        ImageView imageView4 = (ImageView) findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_repeat_toggle);
        this.f13903OooOo0o = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(oooO0O0);
        }
        ImageView imageView5 = (ImageView) findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_shuffle);
        this.f13899OooOo = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(oooO0O0);
        }
        Resources resources = context.getResources();
        this.f13886OooO0o0 = resources;
        this.f13941o000oOoO = resources.getInteger(OooOo00.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f13927OoooOOO = resources.getInteger(OooOo00.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View viewFindViewById10 = findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_vr);
        this.f13905OooOoO0 = viewFindViewById10;
        if (viewFindViewById10 != null) {
            OooOO0O(viewFindViewById10, false);
        }
        o0000 o0000Var = new o0000(this);
        this.f13884OooO0Oo = o0000Var;
        o0000Var.f14060OooOoo = z4;
        OooOO0 oooOO1 = new OooOO0(new String[]{resources.getString(Oooo0.exo_controls_playback_speed), resources.getString(Oooo0.exo_track_selection_title_audio)}, new Drawable[]{o0O00.OooOOOO(context, resources, com.google.android.exoplayer2.ui.OooOOO0.exo_styled_controls_speed), o0O00.OooOOOO(context, resources, com.google.android.exoplayer2.ui.OooOOO0.exo_styled_controls_audiotrack)});
        this.f13883OooO = oooOO1;
        this.f13894OooOOOO = resources.getDimensionPixelSize(com.google.android.exoplayer2.ui.OooOO0O.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(OooOo.exo_styled_settings_list, (ViewGroup) null);
        this.f13888OooO0oo = recyclerView;
        recyclerView.setAdapter(oooOO1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f13892OooOOO = popupWindow;
        if (o0O00.f40595OooO00o < 23) {
            z9 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z9 = false;
        }
        popupWindow.setOnDismissListener(this.f13885OooO0o);
        this.f13952o0ooOoO = true;
        this.f13893OooOOO0 = new com.google.android.exoplayer2.ui.OooO0OO(getResources());
        this.f13930OoooOoO = o0O00.OooOOOO(context, resources, com.google.android.exoplayer2.ui.OooOOO0.exo_styled_controls_subtitle_on);
        this.f13931OoooOoo = o0O00.OooOOOO(context, resources, com.google.android.exoplayer2.ui.OooOOO0.exo_styled_controls_subtitle_off);
        this.f13932Ooooo00 = resources.getString(Oooo0.exo_controls_cc_enabled_description);
        this.f13933Ooooo0o = resources.getString(Oooo0.exo_controls_cc_disabled_description);
        this.f13890OooOO0O = new OooOO0O();
        this.f13891OooOO0o = new OooO00o();
        this.f13889OooOO0 = new OooO0o(resources.getStringArray(com.google.android.exoplayer2.ui.OooO.exo_controls_playback_speeds), f13882o0OOO0o);
        this.f13934OooooO0 = o0O00.OooOOOO(context, resources, com.google.android.exoplayer2.ui.OooOOO0.exo_styled_controls_fullscreen_exit);
        this.f13935OooooOO = o0O00.OooOOOO(context, resources, com.google.android.exoplayer2.ui.OooOOO0.exo_styled_controls_fullscreen_enter);
        this.f13920Oooo0oO = o0O00.OooOOOO(context, resources, com.google.android.exoplayer2.ui.OooOOO0.exo_styled_controls_repeat_off);
        this.f13921Oooo0oo = o0O00.OooOOOO(context, this.f13886OooO0o0, com.google.android.exoplayer2.ui.OooOOO0.exo_styled_controls_repeat_one);
        this.f13911Oooo = o0O00.OooOOOO(context, this.f13886OooO0o0, com.google.android.exoplayer2.ui.OooOOO0.exo_styled_controls_repeat_all);
        this.f13922OoooO = o0O00.OooOOOO(context, this.f13886OooO0o0, com.google.android.exoplayer2.ui.OooOOO0.exo_styled_controls_shuffle_on);
        this.f13926OoooOO0 = o0O00.OooOOOO(context, this.f13886OooO0o0, com.google.android.exoplayer2.ui.OooOOO0.exo_styled_controls_shuffle_off);
        this.f13936OooooOo = this.f13886OooO0o0.getString(Oooo0.exo_controls_fullscreen_exit_description);
        this.f13938Oooooo0 = this.f13886OooO0o0.getString(Oooo0.exo_controls_fullscreen_enter_description);
        this.f13924OoooO00 = this.f13886OooO0o0.getString(Oooo0.exo_controls_repeat_off_description);
        this.f13923OoooO0 = this.f13886OooO0o0.getString(Oooo0.exo_controls_repeat_one_description);
        this.f13925OoooO0O = this.f13886OooO0o0.getString(Oooo0.exo_controls_repeat_all_description);
        this.f13928OoooOOo = this.f13886OooO0o0.getString(Oooo0.exo_controls_shuffle_on_description);
        this.f13929OoooOo0 = this.f13886OooO0o0.getString(Oooo0.exo_controls_shuffle_off_description);
        this.f13884OooO0Oo.OooO0oo((ViewGroup) findViewById(com.google.android.exoplayer2.ui.OooOOOO.exo_bottom_bar), true);
        this.f13884OooO0Oo.OooO0oo(this.f13898OooOOoo, z6);
        this.f13884OooO0Oo.OooO0oo(this.f13901OooOo00, z5);
        this.f13884OooO0Oo.OooO0oo(this.f13895OooOOOo, z7);
        this.f13884OooO0Oo.OooO0oo(this.f13897OooOOo0, z8);
        this.f13884OooO0Oo.OooO0oo(this.f13899OooOo, z2);
        this.f13884OooO0Oo.OooO0oo(this.f13904OooOoO, z3);
        this.f13884OooO0Oo.OooO0oo(this.f13905OooOoO0, z);
        this.f13884OooO0Oo.OooO0oo(this.f13903OooOo0o, this.f13948o00ooo != 0 ? true : z9);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.exoplayer2.ui.o0ooOOo
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                float[] fArr = StyledPlayerControlView.f13882o0OOO0o;
                StyledPlayerControlView styledPlayerControlView = this.f14141OooO0Oo;
                styledPlayerControlView.getClass();
                int i11 = i6 - i4;
                int i12 = i10 - i8;
                if (i5 - i3 == i9 - i7 && i11 == i12) {
                    return;
                }
                PopupWindow popupWindow2 = styledPlayerControlView.f13892OooOOO;
                if (popupWindow2.isShowing()) {
                    styledPlayerControlView.OooOOo0();
                    int width = styledPlayerControlView.getWidth() - popupWindow2.getWidth();
                    int i13 = styledPlayerControlView.f13894OooOOOO;
                    popupWindow2.update(view, width - i13, (-popupWindow2.getHeight()) - i13, -1, -1);
                }
            }
        });
    }
}
