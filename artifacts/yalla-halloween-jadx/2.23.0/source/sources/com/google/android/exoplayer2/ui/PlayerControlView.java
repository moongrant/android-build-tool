package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.RepeatModeUtil;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p037OoooOo0.o000O0O0;
import p037OoooOo0.o000OO0O;
import p203o00o0o0o.o00OOO0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00O0OO;
import p245o00oo0o.o0O00;
import p247o00oo0oO.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class PlayerControlView extends FrameLayout {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final /* synthetic */ int f13799OooooO0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final View f13800OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f13801OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final View f13802OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final CopyOnWriteArrayList<OooO0o> f13803OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final View f13804OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final View f13805OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final View f13806OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final View f13807OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final ImageView f13808OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public final View f13809OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final ImageView f13810OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final TextView f13811OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public final TextView f13812OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final StringBuilder f13813OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public final o0000O0 f13814OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final Formatter f13815OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Drawable f13816OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final com.google.android.exoplayer2.oo0o0Oo.OooO0OO f13817OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final com.google.android.exoplayer2.oo0o0Oo.OooO0O0 f13818OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final o000OO0O f13819OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final o000O0O0 f13820OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Drawable f13821OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Drawable f13822OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final String f13823OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final String f13824OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final String f13825OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Drawable f13826OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Drawable f13827OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f13828Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final String f13829Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final float f13830Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final float f13831Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final String f13832Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @Nullable
    public Player f13833Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f13834Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f13835Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f13836Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f13837Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f13838Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f13839OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f13840OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f13841OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f13842OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f13843OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public long f13844OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public long[] f13845OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean[] f13846OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final long[] f13847OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final boolean[] f13848OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public long f13849Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public long f13850Ooooo0o;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f13851o000oOoO;

    @RequiresApi(21)
    public static final class OooO00o {
        @DoNotInline
        public static boolean OooO00o(View view) {
            return view.isAccessibilityFocused();
        }
    }

    public final class OooO0O0 implements Player.OooO0OO, o0000O0.OooO00o, View.OnClickListener {
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
            PlayerControlView playerControlView = PlayerControlView.this;
            Player player = playerControlView.f13833Oooo0O0;
            if (player == null) {
                return;
            }
            if (playerControlView.f13804OooO0oO == view) {
                player.OooOOO0();
                return;
            }
            if (playerControlView.f13802OooO0o == view) {
                player.OooO0oO();
                return;
            }
            if (playerControlView.f13806OooOO0 == view) {
                if (player.OooOOoo() != 4) {
                    player.OooOo();
                    return;
                }
                return;
            }
            if (playerControlView.f13807OooOO0O == view) {
                player.OooOoO0();
                return;
            }
            if (playerControlView.f13805OooO0oo == view) {
                o0O00.OooOooO(player);
                return;
            }
            if (playerControlView.f13800OooO == view) {
                o0O00.OooOoo(player);
            } else if (playerControlView.f13808OooOO0o == view) {
                player.Oooooo0(RepeatModeUtil.OooO00o(player.OooOo0(), playerControlView.f13841OoooO00));
            } else if (playerControlView.f13810OooOOO0 == view) {
                player.OoooO00(!player.OooOo0O());
            }
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onCues(List list) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final void onEvents(Player player, Player.OooO0O0 oooO0O0) {
            boolean zOooO00o = oooO0O0.OooO00o(4, 5);
            PlayerControlView playerControlView = PlayerControlView.this;
            if (zOooO00o) {
                int i = PlayerControlView.f13799OooooO0;
                playerControlView.OooO0oO();
            }
            if (oooO0O0.OooO00o(4, 5, 7)) {
                int i2 = PlayerControlView.f13799OooooO0;
                playerControlView.OooO0oo();
            }
            o00O0OO o00o0oo2 = oooO0O0.f11346OooO00o;
            if (o00o0oo2.f40569OooO00o.get(8)) {
                int i3 = PlayerControlView.f13799OooooO0;
                playerControlView.OooO();
            }
            if (o00o0oo2.f40569OooO00o.get(9)) {
                int i4 = PlayerControlView.f13799OooooO0;
                playerControlView.OooOO0();
            }
            if (oooO0O0.OooO00o(8, 9, 11, 0, 13)) {
                int i5 = PlayerControlView.f13799OooooO0;
                playerControlView.OooO0o();
            }
            if (oooO0O0.OooO00o(11, 0)) {
                int i6 = PlayerControlView.f13799OooooO0;
                playerControlView.OooOO0O();
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
            PlayerControlView playerControlView = PlayerControlView.this;
            TextView textView = playerControlView.f13812OooOOOo;
            if (textView != null) {
                textView.setText(o0O00.OooOo(playerControlView.f13813OooOOo, playerControlView.f13815OooOOoo, j));
            }
        }

        @Override // com.google.android.exoplayer2.ui.o0000O0.OooO00o
        public final void onScrubStart(o0000O0 o0000o1, long j) {
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.f13837Oooo0oO = true;
            TextView textView = playerControlView.f13812OooOOOo;
            if (textView != null) {
                textView.setText(o0O00.OooOo(playerControlView.f13813OooOOo, playerControlView.f13815OooOOoo, j));
            }
        }

        @Override // com.google.android.exoplayer2.ui.o0000O0.OooO00o
        public final void onScrubStop(o0000O0 o0000o1, long j, boolean z) {
            Player player;
            PlayerControlView playerControlView = PlayerControlView.this;
            int iOooOo00 = 0;
            playerControlView.f13837Oooo0oO = false;
            if (z || (player = playerControlView.f13833Oooo0O0) == null) {
                return;
            }
            com.google.android.exoplayer2.oo0o0Oo oo0o0ooOooOO0 = player.OooOO0();
            if (playerControlView.f13835Oooo0o && !oo0o0ooOooOO0.OooOOo0()) {
                int iOooOOOo = oo0o0ooOooOO0.OooOOOo();
                while (true) {
                    long jOoooOO0 = o0O00.OoooOO0(oo0o0ooOooOO0.OooOOO(iOooOo00, playerControlView.f13817OooOo0).f12941OooOOo0);
                    if (j < jOoooOO0) {
                        break;
                    }
                    if (iOooOo00 == iOooOOOo - 1) {
                        j = jOoooOO0;
                        break;
                    } else {
                        j -= jOoooOO0;
                        iOooOo00++;
                    }
                }
            } else {
                iOooOo00 = player.OooOo00();
            }
            player.Oooo0oo(iOooOo00, j);
            playerControlView.OooO0oo();
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

    public interface OooO0OO {
    }

    public interface OooO0o {
        void OooO00o(int i);
    }

    static {
        o00OOO0.OooO00o("goog.exo.ui");
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    public final void OooO() {
        ImageView imageView;
        if (OooO0Oo() && this.f13834Oooo0OO && (imageView = this.f13808OooOO0o) != null) {
            if (this.f13841OoooO00 == 0) {
                OooO0o0(imageView, false, false);
                return;
            }
            Player player = this.f13833Oooo0O0;
            String str = this.f13823OooOoOO;
            Drawable drawable = this.f13816OooOo;
            if (player == null) {
                OooO0o0(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            OooO0o0(imageView, true, true);
            int iOooOo0 = player.OooOo0();
            if (iOooOo0 == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iOooOo0 == 1) {
                imageView.setImageDrawable(this.f13822OooOoO0);
                imageView.setContentDescription(this.f13825OooOoo0);
            } else if (iOooOo0 == 2) {
                imageView.setImageDrawable(this.f13821OooOoO);
                imageView.setContentDescription(this.f13824OooOoo);
            }
            imageView.setVisibility(0);
        }
    }

    public final boolean OooO00o(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.f13833Oooo0O0;
        if (player != null) {
            if (keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode == 90) {
                        if (player.OooOOoo() != 4) {
                            player.OooOo();
                        }
                    } else if (keyCode == 89) {
                        player.OooOoO0();
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode == 79 || keyCode == 85) {
                            if (o0O00.OoooO00(player)) {
                                o0O00.OooOooO(player);
                            } else {
                                o0O00.OooOoo(player);
                            }
                        } else if (keyCode == 87) {
                            player.OooOOO0();
                        } else if (keyCode == 88) {
                            player.OooO0oO();
                        } else if (keyCode == 126) {
                            o0O00.OooOooO(player);
                        } else if (keyCode == 127) {
                            o0O00.OooOoo(player);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void OooO0O0() {
        if (OooO0Oo()) {
            setVisibility(8);
            Iterator<OooO0o> it = this.f13803OooO0o0.iterator();
            while (it.hasNext()) {
                it.next().OooO00o(getVisibility());
            }
            removeCallbacks(this.f13819OooOo0O);
            removeCallbacks(this.f13820OooOo0o);
            this.f13844OoooOOO = -9223372036854775807L;
        }
    }

    public final void OooO0OO() {
        o000O0O0 o000o0o1 = this.f13820OooOo0o;
        removeCallbacks(o000o0o1);
        if (this.f13838Oooo0oo <= 0) {
            this.f13844OoooOOO = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.f13838Oooo0oo;
        this.f13844OoooOOO = jUptimeMillis + j;
        if (this.f13834Oooo0OO) {
            postDelayed(o000o0o1, j);
        }
    }

    public final boolean OooO0Oo() {
        return getVisibility() == 0;
    }

    public final void OooO0o() {
        boolean zOooo0O0;
        boolean zOooo0O1;
        boolean zOooo0O2;
        boolean zOooo0O3;
        boolean zOooo0O4;
        if (OooO0Oo() && this.f13834Oooo0OO) {
            Player player = this.f13833Oooo0O0;
            if (player != null) {
                zOooo0O0 = player.Oooo0O0(5);
                zOooo0O2 = player.Oooo0O0(7);
                zOooo0O3 = player.Oooo0O0(11);
                zOooo0O4 = player.Oooo0O0(12);
                zOooo0O1 = player.Oooo0O0(9);
            } else {
                zOooo0O0 = false;
                zOooo0O1 = false;
                zOooo0O2 = false;
                zOooo0O3 = false;
                zOooo0O4 = false;
            }
            OooO0o0(this.f13802OooO0o, this.f13839OoooO, zOooo0O2);
            OooO0o0(this.f13807OooOO0O, this.f13840OoooO0, zOooo0O3);
            OooO0o0(this.f13806OooOO0, this.f13842OoooO0O, zOooo0O4);
            OooO0o0(this.f13804OooO0oO, this.f13843OoooOO0, zOooo0O1);
            o0000O0 o0000o1 = this.f13814OooOOo0;
            if (o0000o1 != null) {
                o0000o1.setEnabled(zOooo0O0);
            }
        }
    }

    public final void OooO0o0(@Nullable View view, boolean z, boolean z2) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.f13830Oooo000 : this.f13831Oooo00O);
        view.setVisibility(z ? 0 : 8);
    }

    public final void OooO0oO() {
        boolean z;
        boolean z2;
        boolean z3;
        if (OooO0Oo() && this.f13834Oooo0OO) {
            boolean zOoooO00 = o0O00.OoooO00(this.f13833Oooo0O0);
            View view = this.f13805OooO0oo;
            boolean z4 = true;
            if (view != null) {
                z = (!zOoooO00 && view.isFocused()) | false;
                if (o0O00.f40595OooO00o < 21) {
                    z3 = z;
                } else {
                    z3 = !zOoooO00 && OooO00o.OooO00o(view);
                }
                z2 = z3 | false;
                view.setVisibility(zOoooO00 ? 0 : 8);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.f13800OooO;
            if (view2 != null) {
                z |= zOoooO00 && view2.isFocused();
                if (o0O00.f40595OooO00o < 21) {
                    z4 = z;
                } else if (!zOoooO00 || !OooO00o.OooO00o(view2)) {
                    z4 = false;
                }
                z2 |= z4;
                view2.setVisibility(zOoooO00 ? 8 : 0);
            }
            if (z) {
                boolean zOoooO01 = o0O00.OoooO00(this.f13833Oooo0O0);
                if (zOoooO01 && view != null) {
                    view.requestFocus();
                } else if (!zOoooO01 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z2) {
                boolean zOoooO02 = o0O00.OoooO00(this.f13833Oooo0O0);
                if (zOoooO02 && view != null) {
                    view.sendAccessibilityEvent(8);
                } else {
                    if (zOoooO02 || view2 == null) {
                        return;
                    }
                    view2.sendAccessibilityEvent(8);
                }
            }
        }
    }

    public final void OooO0oo() {
        long jOooOOo;
        long jOooOo0o;
        if (OooO0Oo() && this.f13834Oooo0OO) {
            Player player = this.f13833Oooo0O0;
            if (player != null) {
                jOooOOo = player.OooOOo() + this.f13849Ooooo00;
                jOooOo0o = player.OooOo0o() + this.f13849Ooooo00;
            } else {
                jOooOOo = 0;
                jOooOo0o = 0;
            }
            boolean z = jOooOOo != this.f13850Ooooo0o;
            this.f13850Ooooo0o = jOooOOo;
            TextView textView = this.f13812OooOOOo;
            if (textView != null && !this.f13837Oooo0oO && z) {
                textView.setText(o0O00.OooOo(this.f13813OooOOo, this.f13815OooOOoo, jOooOOo));
            }
            o0000O0 o0000o1 = this.f13814OooOOo0;
            if (o0000o1 != null) {
                o0000o1.setPosition(jOooOOo);
                o0000o1.setBufferedPosition(jOooOo0o);
            }
            o000OO0O o000oo0o2 = this.f13819OooOo0O;
            removeCallbacks(o000oo0o2);
            int iOooOOoo = player == null ? 1 : player.OooOOoo();
            if (player != null && player.isPlaying()) {
                long jMin = Math.min(o0000o1 != null ? o0000o1.getPreferredUpdateDelay() : 1000L, 1000 - (jOooOOo % 1000));
                float f = player.OooO00o().f12827OooO0Oo;
                postDelayed(o000oo0o2, o0O00.OooOO0(f > 0.0f ? (long) (jMin / f) : 1000L, this.f13828Oooo, 1000L));
            } else {
                if (iOooOOoo == 4 || iOooOOoo == 1) {
                    return;
                }
                postDelayed(o000oo0o2, 1000L);
            }
        }
    }

    public final void OooOO0() {
        ImageView imageView;
        if (OooO0Oo() && this.f13834Oooo0OO && (imageView = this.f13810OooOOO0) != null) {
            Player player = this.f13833Oooo0O0;
            if (!this.f13851o000oOoO) {
                OooO0o0(imageView, false, false);
                return;
            }
            String str = this.f13829Oooo0;
            Drawable drawable = this.f13827OooOooo;
            if (player == null) {
                OooO0o0(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            OooO0o0(imageView, true, true);
            if (player.OooOo0O()) {
                drawable = this.f13826OooOooO;
            }
            imageView.setImageDrawable(drawable);
            if (player.OooOo0O()) {
                str = this.f13832Oooo00o;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0109 A[PHI: r6
      0x0109: PHI (r6v12 com.google.android.exoplayer2.oo0o0Oo) = (r6v14 com.google.android.exoplayer2.oo0o0Oo), (r6v15 com.google.android.exoplayer2.oo0o0Oo) binds: [B:50:0x00b1, B:45:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    public final void OooOO0O() {
        boolean z;
        long j;
        int i;
        com.google.android.exoplayer2.oo0o0Oo oo0o0oo;
        boolean z2;
        boolean z3;
        boolean z4;
        Player player = this.f13833Oooo0O0;
        if (player == null) {
            return;
        }
        boolean z5 = this.f13836Oooo0o0;
        long j2 = -9223372036854775807L;
        boolean z6 = true;
        com.google.android.exoplayer2.oo0o0Oo.OooO0OO oooO0OO = this.f13817OooOo0;
        if (z5) {
            com.google.android.exoplayer2.oo0o0Oo oo0o0ooOooOO0 = player.OooOO0();
            if (oo0o0ooOooOO0.OooOOOo() <= 100) {
                int iOooOOOo = oo0o0ooOooOO0.OooOOOo();
                int i2 = 0;
                while (true) {
                    if (i2 >= iOooOOOo) {
                        z4 = true;
                        break;
                    } else {
                        if (oo0o0ooOooOO0.OooOOO(i2, oooO0OO).f12941OooOOo0 == -9223372036854775807L) {
                            z4 = false;
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                z4 = false;
                break;
            }
            if (z4) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f13835Oooo0o = z;
        this.f13849Ooooo00 = 0L;
        com.google.android.exoplayer2.oo0o0Oo oo0o0ooOooOO1 = player.OooOO0();
        if (oo0o0ooOooOO1.OooOOo0()) {
            j = 0;
            i = 0;
        } else {
            int iOooOo00 = player.OooOo00();
            boolean z7 = this.f13835Oooo0o;
            int i3 = z7 ? 0 : iOooOo00;
            int iOooOOOo2 = z7 ? oo0o0ooOooOO1.OooOOOo() - 1 : iOooOo00;
            long j3 = 0;
            i = 0;
            while (i3 <= iOooOOOo2) {
                if (i3 == iOooOo00) {
                    this.f13849Ooooo00 = o0O00.OoooOO0(j3);
                }
                oo0o0ooOooOO1.OooOOO(i3, oooO0OO);
                if (oooO0OO.f12941OooOOo0 == j2) {
                    o00O000o.OooO0Oo(this.f13835Oooo0o ^ z6);
                    break;
                }
                int i4 = oooO0OO.f12940OooOOo;
                while (i4 <= oooO0OO.f12942OooOOoo) {
                    com.google.android.exoplayer2.oo0o0Oo.OooO0O0 oooO0O0 = this.f13818OooOo00;
                    oo0o0ooOooOO1.OooO0o(i4, oooO0O0);
                    AdPlaybackState adPlaybackState = oooO0O0.f12910OooOO0;
                    int i5 = adPlaybackState.f13137OooO0oo;
                    while (i5 < adPlaybackState.f13135OooO0o0) {
                        long jOooO0Oo = oooO0O0.OooO0Oo(i5);
                        int i6 = iOooOo00;
                        if (jOooO0Oo == Long.MIN_VALUE) {
                            oo0o0oo = oo0o0ooOooOO1;
                            long j4 = oooO0O0.f12908OooO0oO;
                            if (j4 != j2) {
                                jOooO0Oo = j4;
                            }
                            i5++;
                            oo0o0ooOooOO1 = oo0o0oo;
                            iOooOo00 = i6;
                            j2 = -9223372036854775807L;
                        } else {
                            oo0o0oo = oo0o0ooOooOO1;
                        }
                        long j5 = jOooO0Oo + oooO0O0.f12909OooO0oo;
                        if (j5 >= 0) {
                            long[] jArr = this.f13845OoooOOo;
                            if (i == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.f13845OoooOOo = Arrays.copyOf(jArr, length);
                                this.f13846OoooOo0 = Arrays.copyOf(this.f13846OoooOo0, length);
                            }
                            this.f13845OoooOOo[i] = o0O00.OoooOO0(j3 + j5);
                            boolean[] zArr = this.f13846OoooOo0;
                            AdPlaybackState.OooO00o OooO00o2 = oooO0O0.f12910OooOO0.OooO00o(i5);
                            int i7 = OooO00o2.f13150OooO0o0;
                            if (i7 == -1) {
                                z2 = true;
                                z3 = z2;
                            } else {
                                int i8 = 0;
                                while (true) {
                                    if (i8 < i7) {
                                        int i9 = i7;
                                        int i10 = OooO00o2.f13152OooO0oo[i8];
                                        if (i10 != 0) {
                                            AdPlaybackState.OooO00o oooO00o = OooO00o2;
                                            z2 = true;
                                            if (i10 != 1) {
                                                i8++;
                                                i7 = i9;
                                                OooO00o2 = oooO00o;
                                            }
                                        } else {
                                            z2 = true;
                                        }
                                        z3 = z2;
                                    } else {
                                        z2 = true;
                                        z3 = false;
                                    }
                                }
                            }
                            zArr[i] = z3 ^ z2;
                            i++;
                        }
                        i5++;
                        oo0o0ooOooOO1 = oo0o0oo;
                        iOooOo00 = i6;
                        j2 = -9223372036854775807L;
                    }
                    i4++;
                    j2 = -9223372036854775807L;
                    z6 = true;
                    oo0o0ooOooOO1 = oo0o0ooOooOO1;
                }
                j3 += oooO0OO.f12941OooOOo0;
                i3++;
                j2 = -9223372036854775807L;
                z6 = z6;
                oo0o0ooOooOO1 = oo0o0ooOooOO1;
            }
            j = j3;
        }
        long jOoooOO0 = o0O00.OoooOO0(j);
        TextView textView = this.f13811OooOOOO;
        if (textView != null) {
            textView.setText(o0O00.OooOo(this.f13813OooOOo, this.f13815OooOOoo, jOoooOO0));
        }
        o0000O0 o0000o1 = this.f13814OooOOo0;
        if (o0000o1 != null) {
            o0000o1.setDuration(jOoooOO0);
            long[] jArr2 = this.f13847OoooOoO;
            int length2 = jArr2.length;
            int i11 = i + length2;
            long[] jArr3 = this.f13845OoooOOo;
            if (i11 > jArr3.length) {
                this.f13845OoooOOo = Arrays.copyOf(jArr3, i11);
                this.f13846OoooOo0 = Arrays.copyOf(this.f13846OoooOo0, i11);
            }
            System.arraycopy(jArr2, 0, this.f13845OoooOOo, i, length2);
            System.arraycopy(this.f13848OoooOoo, 0, this.f13846OoooOo0, i, length2);
            o0000o1.OooO00o(this.f13845OoooOOo, this.f13846OoooOo0, i11);
        }
        OooO0oo();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return OooO00o(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f13820OooOo0o);
        } else if (motionEvent.getAction() == 1) {
            OooO0OO();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public Player getPlayer() {
        return this.f13833Oooo0O0;
    }

    public int getRepeatToggleModes() {
        return this.f13841OoooO00;
    }

    public boolean getShowShuffleButton() {
        return this.f13851o000oOoO;
    }

    public int getShowTimeoutMs() {
        return this.f13838Oooo0oo;
    }

    public boolean getShowVrButton() {
        View view = this.f13809OooOOO;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13834Oooo0OO = true;
        long j = this.f13844OoooOOO;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                OooO0O0();
            } else {
                postDelayed(this.f13820OooOo0o, jUptimeMillis);
            }
        } else if (OooO0Oo()) {
            OooO0OO();
        }
        OooO0oO();
        OooO0o();
        OooO();
        OooOO0();
        OooOO0O();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13834Oooo0OO = false;
        removeCallbacks(this.f13819OooOo0O);
        removeCallbacks(this.f13820OooOo0o);
    }

    public void setPlayer(@Nullable Player player) {
        boolean z = true;
        o00O000o.OooO0Oo(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.OooOO0O() != Looper.getMainLooper()) {
            z = false;
        }
        o00O000o.OooO00o(z);
        Player player2 = this.f13833Oooo0O0;
        if (player2 == player) {
            return;
        }
        OooO0O0 oooO0O0 = this.f13801OooO0Oo;
        if (player2 != null) {
            player2.OooOooo(oooO0O0);
        }
        this.f13833Oooo0O0 = player;
        if (player != null) {
            player.Ooooo00(oooO0O0);
        }
        OooO0oO();
        OooO0o();
        OooO();
        OooOO0();
        OooOO0O();
    }

    public void setProgressUpdateListener(@Nullable OooO0OO oooO0OO) {
    }

    public void setRepeatToggleModes(int i) {
        this.f13841OoooO00 = i;
        Player player = this.f13833Oooo0O0;
        if (player != null) {
            int iOooOo0 = player.OooOo0();
            if (i == 0 && iOooOo0 != 0) {
                this.f13833Oooo0O0.Oooooo0(0);
            } else if (i == 1 && iOooOo0 == 2) {
                this.f13833Oooo0O0.Oooooo0(1);
            } else if (i == 2 && iOooOo0 == 1) {
                this.f13833Oooo0O0.Oooooo0(2);
            }
        }
        OooO();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f13842OoooO0O = z;
        OooO0o();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f13836Oooo0o0 = z;
        OooOO0O();
    }

    public void setShowNextButton(boolean z) {
        this.f13843OoooOO0 = z;
        OooO0o();
    }

    public void setShowPreviousButton(boolean z) {
        this.f13839OoooO = z;
        OooO0o();
    }

    public void setShowRewindButton(boolean z) {
        this.f13840OoooO0 = z;
        OooO0o();
    }

    public void setShowShuffleButton(boolean z) {
        this.f13851o000oOoO = z;
        OooOO0();
    }

    public void setShowTimeoutMs(int i) {
        this.f13838Oooo0oo = i;
        if (OooO0Oo()) {
            OooO0OO();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.f13809OooOOO;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f13828Oooo = o0O00.OooO(i, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.f13809OooOOO;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            OooO0o0(view, getShowVrButton(), onClickListener != null);
        }
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int resourceId = OooOo.exo_player_control_view;
        this.f13838Oooo0oo = 5000;
        this.f13841OoooO00 = 0;
        this.f13828Oooo = 200;
        this.f13844OoooOOO = -9223372036854775807L;
        this.f13840OoooO0 = true;
        this.f13842OoooO0O = true;
        this.f13839OoooO = true;
        this.f13843OoooOO0 = true;
        this.f13851o000oOoO = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, o0OoOo0.PlayerControlView, i, 0);
            try {
                this.f13838Oooo0oo = typedArrayObtainStyledAttributes.getInt(o0OoOo0.PlayerControlView_show_timeout, this.f13838Oooo0oo);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(o0OoOo0.PlayerControlView_controller_layout_id, resourceId);
                this.f13841OoooO00 = typedArrayObtainStyledAttributes.getInt(o0OoOo0.PlayerControlView_repeat_toggle_modes, this.f13841OoooO00);
                this.f13840OoooO0 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.PlayerControlView_show_rewind_button, this.f13840OoooO0);
                this.f13842OoooO0O = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.PlayerControlView_show_fastforward_button, this.f13842OoooO0O);
                this.f13839OoooO = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.PlayerControlView_show_previous_button, this.f13839OoooO);
                this.f13843OoooOO0 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.PlayerControlView_show_next_button, this.f13843OoooOO0);
                this.f13851o000oOoO = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.PlayerControlView_show_shuffle_button, this.f13851o000oOoO);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(o0OoOo0.PlayerControlView_time_bar_min_update_interval, this.f13828Oooo));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f13803OooO0o0 = new CopyOnWriteArrayList<>();
        this.f13818OooOo00 = new com.google.android.exoplayer2.oo0o0Oo.OooO0O0();
        this.f13817OooOo0 = new com.google.android.exoplayer2.oo0o0Oo.OooO0OO();
        StringBuilder sb = new StringBuilder();
        this.f13813OooOOo = sb;
        this.f13815OooOOoo = new Formatter(sb, Locale.getDefault());
        this.f13845OoooOOo = new long[0];
        this.f13846OoooOo0 = new boolean[0];
        this.f13847OoooOoO = new long[0];
        this.f13848OoooOoo = new boolean[0];
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f13801OooO0Oo = oooO0O0;
        this.f13819OooOo0O = new o000OO0O(this, 1);
        this.f13820OooOo0o = new o000O0O0(this, 1);
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        int i2 = OooOOOO.exo_progress;
        o0000O0 o0000o1 = (o0000O0) findViewById(i2);
        View viewFindViewById = findViewById(OooOOOO.exo_progress_placeholder);
        if (o0000o1 != null) {
            this.f13814OooOOo0 = o0000o1;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(i2);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f13814OooOOo0 = defaultTimeBar;
        } else {
            this.f13814OooOOo0 = null;
        }
        this.f13811OooOOOO = (TextView) findViewById(OooOOOO.exo_duration);
        this.f13812OooOOOo = (TextView) findViewById(OooOOOO.exo_position);
        o0000O0 o0000o2 = this.f13814OooOOo0;
        if (o0000o2 != null) {
            o0000o2.OooO0O0(oooO0O0);
        }
        View viewFindViewById2 = findViewById(OooOOOO.exo_play);
        this.f13805OooO0oo = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(oooO0O0);
        }
        View viewFindViewById3 = findViewById(OooOOOO.exo_pause);
        this.f13800OooO = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(oooO0O0);
        }
        View viewFindViewById4 = findViewById(OooOOOO.exo_prev);
        this.f13802OooO0o = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(oooO0O0);
        }
        View viewFindViewById5 = findViewById(OooOOOO.exo_next);
        this.f13804OooO0oO = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(oooO0O0);
        }
        View viewFindViewById6 = findViewById(OooOOOO.exo_rew);
        this.f13807OooOO0O = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(oooO0O0);
        }
        View viewFindViewById7 = findViewById(OooOOOO.exo_ffwd);
        this.f13806OooOO0 = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(oooO0O0);
        }
        ImageView imageView = (ImageView) findViewById(OooOOOO.exo_repeat_toggle);
        this.f13808OooOO0o = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(oooO0O0);
        }
        ImageView imageView2 = (ImageView) findViewById(OooOOOO.exo_shuffle);
        this.f13810OooOOO0 = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(oooO0O0);
        }
        View viewFindViewById8 = findViewById(OooOOOO.exo_vr);
        this.f13809OooOOO = viewFindViewById8;
        setShowVrButton(false);
        OooO0o0(viewFindViewById8, false, false);
        Resources resources = context.getResources();
        this.f13830Oooo000 = resources.getInteger(OooOo00.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f13831Oooo00O = resources.getInteger(OooOo00.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.f13816OooOo = o0O00.OooOOOO(context, resources, OooOOO0.exo_controls_repeat_off);
        this.f13822OooOoO0 = o0O00.OooOOOO(context, resources, OooOOO0.exo_controls_repeat_one);
        this.f13821OooOoO = o0O00.OooOOOO(context, resources, OooOOO0.exo_controls_repeat_all);
        this.f13826OooOooO = o0O00.OooOOOO(context, resources, OooOOO0.exo_controls_shuffle_on);
        this.f13827OooOooo = o0O00.OooOOOO(context, resources, OooOOO0.exo_controls_shuffle_off);
        this.f13823OooOoOO = resources.getString(Oooo0.exo_controls_repeat_off_description);
        this.f13825OooOoo0 = resources.getString(Oooo0.exo_controls_repeat_one_description);
        this.f13824OooOoo = resources.getString(Oooo0.exo_controls_repeat_all_description);
        this.f13832Oooo00o = resources.getString(Oooo0.exo_controls_shuffle_on_description);
        this.f13829Oooo0 = resources.getString(Oooo0.exo_controls_shuffle_off_description);
        this.f13850Ooooo0o = -9223372036854775807L;
    }
}
