package androidx.media3.ui;

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
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.util.RepeatModeUtil;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p029Oooo0oo.o0O00O0o;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class LegacyPlayerControlView extends FrameLayout {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final /* synthetic */ int f9574OooooO0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final View f9575OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f9576OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final View f9577OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final CopyOnWriteArrayList<OooO0o> f9578OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final View f9579OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final View f9580OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final View f9581OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final View f9582OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final ImageView f9583OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public final View f9584OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final ImageView f9585OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final TextView f9586OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public final TextView f9587OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final StringBuilder f9588OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public final o000O000 f9589OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final Formatter f9590OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Drawable f9591OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final androidx.media3.common.Oooo0.OooO0o f9592OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final androidx.media3.common.Oooo0.OooO0O0 f9593OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final OooOO0 f9594OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final o0O00O0o f9595OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Drawable f9596OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Drawable f9597OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final String f9598OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final String f9599OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final String f9600OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Drawable f9601OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Drawable f9602OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f9603Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final String f9604Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final float f9605Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final float f9606Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final String f9607Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @Nullable
    public Player f9608Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f9609Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f9610Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f9611Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f9612Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f9613Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f9614OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f9615OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f9616OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f9617OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f9618OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public long f9619OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public long[] f9620OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean[] f9621OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final long[] f9622OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final boolean[] f9623OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public long f9624Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public long f9625Ooooo0o;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f9626o000oOoO;

    @RequiresApi(21)
    public static final class OooO00o {
        @DoNotInline
        public static boolean OooO00o(View view) {
            return view.isAccessibilityFocused();
        }
    }

    public final class OooO0O0 implements Player.OooO0OO, o000O000.OooO00o, View.OnClickListener {
        public OooO0O0() {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onAudioAttributesChanged(androidx.media3.common.OooO00o oooO00o) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onAvailableCommandsChanged(Player.OooO00o oooO00o) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            Player player = legacyPlayerControlView.f9608Oooo0O0;
            if (player == null) {
                return;
            }
            if (legacyPlayerControlView.f9579OooO0oO == view) {
                player.OooOo();
                return;
            }
            if (legacyPlayerControlView.f9577OooO0o == view) {
                player.OooOO0();
                return;
            }
            if (legacyPlayerControlView.f9581OooOO0 == view) {
                if (player.Oooo0o() != 4) {
                    player.OoooOO0();
                    return;
                }
                return;
            }
            if (legacyPlayerControlView.f9582OooOO0O == view) {
                player.o000oOoO();
                return;
            }
            if (legacyPlayerControlView.f9580OooO0oo == view) {
                o00.OooOooo(player);
                return;
            }
            if (legacyPlayerControlView.f9575OooO == view) {
                o00.OooOooO(player);
            } else if (legacyPlayerControlView.f9583OooOO0o == view) {
                player.Oooo0oo(RepeatModeUtil.OooO00o(player.OoooO0(), legacyPlayerControlView.f9616OoooO00));
            } else if (legacyPlayerControlView.f9585OooOOO0 == view) {
                player.OooOoo0(!player.OoooO0O());
            }
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onCues(List list) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final void onEvents(Player player, Player.OooO0O0 oooO0O0) {
            androidx.media3.common.OooO oooO = oooO0O0.f6706OooO00o;
            boolean zOooO00o = oooO.OooO00o(4, 5);
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            if (zOooO00o) {
                int i = LegacyPlayerControlView.f9574OooooO0;
                legacyPlayerControlView.OooO0o();
            }
            if (oooO.OooO00o(4, 5, 7)) {
                int i2 = LegacyPlayerControlView.f9574OooooO0;
                legacyPlayerControlView.OooO0oO();
            }
            if (oooO.f6338OooO00o.get(8)) {
                int i3 = LegacyPlayerControlView.f9574OooooO0;
                legacyPlayerControlView.OooO0oo();
            }
            if (oooO.f6338OooO00o.get(9)) {
                int i4 = LegacyPlayerControlView.f9574OooooO0;
                legacyPlayerControlView.OooO();
            }
            if (oooO.OooO00o(8, 9, 11, 0, 13)) {
                int i5 = LegacyPlayerControlView.f9574OooooO0;
                legacyPlayerControlView.OooO0o0();
            }
            if (oooO.OooO00o(11, 0)) {
                int i6 = LegacyPlayerControlView.f9574OooooO0;
                legacyPlayerControlView.OooOO0();
            }
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onIsLoadingChanged(boolean z) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onIsPlayingChanged(boolean z) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onLoadingChanged(boolean z) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onMediaItemTransition(androidx.media3.common.OooOOO0 oooOOO0, int i) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onMetadata(Metadata metadata) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPlaybackParametersChanged(androidx.media3.common.OooOOOO oooOOOO) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPlaybackStateChanged(int i) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPlayerError(PlaybackException playbackException) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPositionDiscontinuity(int i) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onRenderedFirstFrame() {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onRepeatModeChanged(int i) {
        }

        @Override // androidx.media3.ui.o000O000.OooO00o
        public final void onScrubMove(o000O000 o000o001, long j) {
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            TextView textView = legacyPlayerControlView.f9587OooOOOo;
            if (textView != null) {
                textView.setText(o00.OooOoO0(legacyPlayerControlView.f9588OooOOo, legacyPlayerControlView.f9590OooOOoo, j));
            }
        }

        @Override // androidx.media3.ui.o000O000.OooO00o
        public final void onScrubStart(o000O000 o000o001, long j) {
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            legacyPlayerControlView.f9612Oooo0oO = true;
            TextView textView = legacyPlayerControlView.f9587OooOOOo;
            if (textView != null) {
                textView.setText(o00.OooOoO0(legacyPlayerControlView.f9588OooOOo, legacyPlayerControlView.f9590OooOOoo, j));
            }
        }

        @Override // androidx.media3.ui.o000O000.OooO00o
        public final void onScrubStop(o000O000 o000o001, long j, boolean z) {
            Player player;
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            int iOooo0oO = 0;
            legacyPlayerControlView.f9612Oooo0oO = false;
            if (z || (player = legacyPlayerControlView.f9608Oooo0O0) == null) {
                return;
            }
            androidx.media3.common.Oooo0 oooo0OooOo0 = player.OooOo0();
            if (legacyPlayerControlView.f9610Oooo0o && !oooo0OooOo0.OooOo00()) {
                int iOooOOoo = oooo0OooOo0.OooOOoo();
                while (true) {
                    long jOooO0OO = oooo0OooOo0.OooOOo0(iOooo0oO, legacyPlayerControlView.f9592OooOo0).OooO0OO();
                    if (j < jOooO0OO) {
                        break;
                    }
                    if (iOooo0oO == iOooOOoo - 1) {
                        j = jOooO0OO;
                        break;
                    } else {
                        j -= jOooO0OO;
                        iOooo0oO++;
                    }
                }
            } else {
                iOooo0oO = player.Oooo0oO();
            }
            player.OooOoO(iOooo0oO, j);
            legacyPlayerControlView.OooO0oO();
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onSeekBackIncrementChanged(long j) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onSeekForwardIncrementChanged(long j) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onTimelineChanged(androidx.media3.common.Oooo0 oooo0, int i) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onTrackSelectionParametersChanged(androidx.media3.common.o00O0O o00o0o2) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onTracksChanged(androidx.media3.common.o00Oo0 o00oo1) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onVideoSizeChanged(androidx.media3.common.o00Ooo o00ooo2) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onVolumeChanged(float f) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onCues(o000O000.OooO0O0 oooO0O0) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPositionDiscontinuity(Player.OooO0o oooO0o, Player.OooO0o oooO0o2, int i) {
        }
    }

    public interface OooO0OO {
    }

    public interface OooO0o {
        void OooO00o();
    }

    static {
        p069o0000ooO.o0000.OooO00o("media3.ui");
    }

    public LegacyPlayerControlView(Context context) {
        this(context, null);
    }

    public final void OooO() {
        ImageView imageView;
        if (OooO0OO() && this.f9609Oooo0OO && (imageView = this.f9585OooOOO0) != null) {
            Player player = this.f9608Oooo0O0;
            if (!this.f9626o000oOoO) {
                OooO0Oo(imageView, false, false);
                return;
            }
            String str = this.f9604Oooo0;
            Drawable drawable = this.f9602OooOooo;
            if (player == null) {
                OooO0Oo(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            OooO0Oo(imageView, true, true);
            if (player.OoooO0O()) {
                drawable = this.f9601OooOooO;
            }
            imageView.setImageDrawable(drawable);
            if (player.OoooO0O()) {
                str = this.f9607Oooo00o;
            }
            imageView.setContentDescription(str);
        }
    }

    public final void OooO00o() {
        if (OooO0OO()) {
            setVisibility(8);
            for (OooO0o oooO0o : this.f9578OooO0o0) {
                getVisibility();
                oooO0o.OooO00o();
            }
            removeCallbacks(this.f9594OooOo0O);
            removeCallbacks(this.f9595OooOo0o);
            this.f9619OoooOOO = -9223372036854775807L;
        }
    }

    public final void OooO0O0() {
        o0O00O0o o0o00o0o = this.f9595OooOo0o;
        removeCallbacks(o0o00o0o);
        if (this.f9613Oooo0oo <= 0) {
            this.f9619OoooOOO = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.f9613Oooo0oo;
        this.f9619OoooOOO = jUptimeMillis + j;
        if (this.f9609Oooo0OO) {
            postDelayed(o0o00o0o, j);
        }
    }

    public final boolean OooO0OO() {
        return getVisibility() == 0;
    }

    public final void OooO0Oo(@Nullable View view, boolean z, boolean z2) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.f9605Oooo000 : this.f9606Oooo00O);
        view.setVisibility(z ? 0 : 8);
    }

    public final void OooO0o() {
        boolean z;
        boolean z2;
        boolean z3;
        if (OooO0OO() && this.f9609Oooo0OO) {
            boolean zOoooO0 = o00.OoooO0(this.f9608Oooo0O0);
            boolean z4 = true;
            View view = this.f9580OooO0oo;
            if (view != null) {
                z = (!zOoooO0 && view.isFocused()) | false;
                if (o00.f34910OooO00o < 21) {
                    z3 = z;
                } else {
                    z3 = !zOoooO0 && OooO00o.OooO00o(view);
                }
                z2 = z3 | false;
                view.setVisibility(zOoooO0 ? 0 : 8);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.f9575OooO;
            if (view2 != null) {
                z |= zOoooO0 && view2.isFocused();
                if (o00.f34910OooO00o < 21) {
                    z4 = z;
                } else if (!zOoooO0 || !OooO00o.OooO00o(view2)) {
                    z4 = false;
                }
                z2 |= z4;
                view2.setVisibility(zOoooO0 ? 8 : 0);
            }
            if (z) {
                boolean zOoooO1 = o00.OoooO0(this.f9608Oooo0O0);
                if (zOoooO1 && view != null) {
                    view.requestFocus();
                } else if (!zOoooO1 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z2) {
                boolean zOoooO2 = o00.OoooO0(this.f9608Oooo0O0);
                if (zOoooO2 && view != null) {
                    view.sendAccessibilityEvent(8);
                } else {
                    if (zOoooO2 || view2 == null) {
                        return;
                    }
                    view2.sendAccessibilityEvent(8);
                }
            }
        }
    }

    public final void OooO0o0() {
        boolean zOooOOo0;
        boolean zOooOOo1;
        boolean zOooOOo2;
        boolean zOooOOo3;
        boolean zOooOOo4;
        if (OooO0OO() && this.f9609Oooo0OO) {
            Player player = this.f9608Oooo0O0;
            if (player != null) {
                zOooOOo0 = player.OooOOo0(5);
                zOooOOo2 = player.OooOOo0(7);
                zOooOOo3 = player.OooOOo0(11);
                zOooOOo4 = player.OooOOo0(12);
                zOooOOo1 = player.OooOOo0(9);
            } else {
                zOooOOo0 = false;
                zOooOOo1 = false;
                zOooOOo2 = false;
                zOooOOo3 = false;
                zOooOOo4 = false;
            }
            OooO0Oo(this.f9577OooO0o, this.f9614OoooO, zOooOOo2);
            OooO0Oo(this.f9582OooOO0O, this.f9615OoooO0, zOooOOo3);
            OooO0Oo(this.f9581OooOO0, this.f9617OoooO0O, zOooOOo4);
            OooO0Oo(this.f9579OooO0oO, this.f9618OoooOO0, zOooOOo1);
            o000O000 o000o001 = this.f9589OooOOo0;
            if (o000o001 != null) {
                o000o001.setEnabled(zOooOOo0);
            }
        }
    }

    public final void OooO0oO() {
        long jOooo0OO;
        long jOoooO;
        if (OooO0OO() && this.f9609Oooo0OO) {
            Player player = this.f9608Oooo0O0;
            if (player != null) {
                jOooo0OO = player.Oooo0OO() + this.f9624Ooooo00;
                jOoooO = player.OoooO() + this.f9624Ooooo00;
            } else {
                jOooo0OO = 0;
                jOoooO = 0;
            }
            boolean z = jOooo0OO != this.f9625Ooooo0o;
            this.f9625Ooooo0o = jOooo0OO;
            TextView textView = this.f9587OooOOOo;
            if (textView != null && !this.f9612Oooo0oO && z) {
                textView.setText(o00.OooOoO0(this.f9588OooOOo, this.f9590OooOOoo, jOooo0OO));
            }
            o000O000 o000o001 = this.f9589OooOOo0;
            if (o000o001 != null) {
                o000o001.setPosition(jOooo0OO);
                o000o001.setBufferedPosition(jOoooO);
            }
            OooOO0 oooOO1 = this.f9594OooOo0O;
            removeCallbacks(oooOO1);
            int iOooo0o = player == null ? 1 : player.Oooo0o();
            if (player != null && player.isPlaying()) {
                long jMin = Math.min(o000o001 != null ? o000o001.getPreferredUpdateDelay() : 1000L, 1000 - (jOooo0OO % 1000));
                float f = player.OooO0O0().f6619OooO0Oo;
                postDelayed(oooOO1, o00.OooOO0(f > 0.0f ? (long) (jMin / f) : 1000L, this.f9603Oooo, 1000L));
            } else {
                if (iOooo0o == 4 || iOooo0o == 1) {
                    return;
                }
                postDelayed(oooOO1, 1000L);
            }
        }
    }

    public final void OooO0oo() {
        ImageView imageView;
        if (OooO0OO() && this.f9609Oooo0OO && (imageView = this.f9583OooOO0o) != null) {
            if (this.f9616OoooO00 == 0) {
                OooO0Oo(imageView, false, false);
                return;
            }
            Player player = this.f9608Oooo0O0;
            String str = this.f9598OooOoOO;
            Drawable drawable = this.f9591OooOo;
            if (player == null) {
                OooO0Oo(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            OooO0Oo(imageView, true, true);
            int iOoooO0 = player.OoooO0();
            if (iOoooO0 == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iOoooO0 == 1) {
                imageView.setImageDrawable(this.f9597OooOoO0);
                imageView.setContentDescription(this.f9600OooOoo0);
            } else if (iOoooO0 == 2) {
                imageView.setImageDrawable(this.f9596OooOoO);
                imageView.setContentDescription(this.f9599OooOoo);
            }
            imageView.setVisibility(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0109 A[PHI: r6
      0x0109: PHI (r6v12 androidx.media3.common.Oooo0) = (r6v14 androidx.media3.common.Oooo0), (r6v15 androidx.media3.common.Oooo0) binds: [B:50:0x00b1, B:45:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    public final void OooOO0() {
        boolean z;
        long j;
        int i;
        androidx.media3.common.Oooo0 oooo0;
        boolean z2;
        boolean z3;
        boolean z4;
        Player player = this.f9608Oooo0O0;
        if (player == null) {
            return;
        }
        boolean z5 = this.f9611Oooo0o0;
        long j2 = -9223372036854775807L;
        boolean z6 = true;
        androidx.media3.common.Oooo0.OooO0o oooO0o = this.f9592OooOo0;
        if (z5) {
            androidx.media3.common.Oooo0 oooo0OooOo0 = player.OooOo0();
            if (oooo0OooOo0.OooOOoo() <= 100) {
                int iOooOOoo = oooo0OooOo0.OooOOoo();
                int i2 = 0;
                while (true) {
                    if (i2 >= iOooOOoo) {
                        z4 = true;
                        break;
                    } else {
                        if (oooo0OooOo0.OooOOo0(i2, oooO0o).f6682OooOOo0 == -9223372036854775807L) {
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
        this.f9610Oooo0o = z;
        this.f9624Ooooo00 = 0L;
        androidx.media3.common.Oooo0 oooo0OooOo1 = player.OooOo0();
        if (oooo0OooOo1.OooOo00()) {
            j = 0;
            i = 0;
        } else {
            int iOooo0oO = player.Oooo0oO();
            boolean z7 = this.f9610Oooo0o;
            int i3 = z7 ? 0 : iOooo0oO;
            int iOooOOoo2 = z7 ? oooo0OooOo1.OooOOoo() - 1 : iOooo0oO;
            long j3 = 0;
            i = 0;
            while (i3 <= iOooOOoo2) {
                if (i3 == iOooo0oO) {
                    this.f9624Ooooo00 = o00.o000oOoO(j3);
                }
                oooo0OooOo1.OooOOo0(i3, oooO0o);
                if (oooO0o.f6682OooOOo0 == j2) {
                    p080o000OoO.o00Oo0.OooO0Oo(this.f9610Oooo0o ^ z6);
                    break;
                }
                int i4 = oooO0o.f6681OooOOo;
                while (i4 <= oooO0o.f6683OooOOoo) {
                    androidx.media3.common.Oooo0.OooO0O0 oooO0O0 = this.f9593OooOo00;
                    oooo0OooOo1.OooO(i4, oooO0O0);
                    AdPlaybackState adPlaybackState = oooO0O0.f6646OooOO0;
                    int i5 = adPlaybackState.f6188OooO0oo;
                    while (i5 < adPlaybackState.f6186OooO0o0) {
                        long jOooO0oO = oooO0O0.OooO0oO(i5);
                        int i6 = iOooo0oO;
                        if (jOooO0oO == Long.MIN_VALUE) {
                            oooo0 = oooo0OooOo1;
                            long j4 = oooO0O0.f6644OooO0oO;
                            if (j4 != j2) {
                                jOooO0oO = j4;
                            }
                            i5++;
                            oooo0OooOo1 = oooo0;
                            iOooo0oO = i6;
                            j2 = -9223372036854775807L;
                        } else {
                            oooo0 = oooo0OooOo1;
                        }
                        long j5 = jOooO0oO + oooO0O0.f6645OooO0oo;
                        if (j5 >= 0) {
                            long[] jArr = this.f9620OoooOOo;
                            if (i == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.f9620OoooOOo = Arrays.copyOf(jArr, length);
                                this.f9621OoooOo0 = Arrays.copyOf(this.f9621OoooOo0, length);
                            }
                            this.f9620OoooOOo[i] = o00.o000oOoO(j3 + j5);
                            boolean[] zArr = this.f9621OoooOo0;
                            AdPlaybackState.OooO00o oooO00oOooO0OO = oooO0O0.f6646OooOO0.OooO0OO(i5);
                            int i7 = oooO00oOooO0OO.f6201OooO0o0;
                            if (i7 == -1) {
                                z2 = true;
                                z3 = z2;
                            } else {
                                int i8 = 0;
                                while (true) {
                                    if (i8 < i7) {
                                        int i9 = i7;
                                        int i10 = oooO00oOooO0OO.f6203OooO0oo[i8];
                                        if (i10 != 0) {
                                            AdPlaybackState.OooO00o oooO00o = oooO00oOooO0OO;
                                            z2 = true;
                                            if (i10 != 1) {
                                                i8++;
                                                i7 = i9;
                                                oooO00oOooO0OO = oooO00o;
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
                        oooo0OooOo1 = oooo0;
                        iOooo0oO = i6;
                        j2 = -9223372036854775807L;
                    }
                    i4++;
                    j2 = -9223372036854775807L;
                    z6 = true;
                    oooo0OooOo1 = oooo0OooOo1;
                }
                j3 += oooO0o.f6682OooOOo0;
                i3++;
                j2 = -9223372036854775807L;
                z6 = z6;
                oooo0OooOo1 = oooo0OooOo1;
            }
            j = j3;
        }
        long jO000oOoO = o00.o000oOoO(j);
        TextView textView = this.f9586OooOOOO;
        if (textView != null) {
            textView.setText(o00.OooOoO0(this.f9588OooOOo, this.f9590OooOOoo, jO000oOoO));
        }
        o000O000 o000o001 = this.f9589OooOOo0;
        if (o000o001 != null) {
            o000o001.setDuration(jO000oOoO);
            long[] jArr2 = this.f9622OoooOoO;
            int length2 = jArr2.length;
            int i11 = i + length2;
            long[] jArr3 = this.f9620OoooOOo;
            if (i11 > jArr3.length) {
                this.f9620OoooOOo = Arrays.copyOf(jArr3, i11);
                this.f9621OoooOo0 = Arrays.copyOf(this.f9621OoooOo0, i11);
            }
            System.arraycopy(jArr2, 0, this.f9620OoooOOo, i, length2);
            System.arraycopy(this.f9623OoooOoo, 0, this.f9621OoooOo0, i, length2);
            o000o001.OooO0O0(this.f9620OoooOOo, this.f9621OoooOo0, i11);
        }
        OooO0oO();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        int keyCode = keyEvent.getKeyCode();
        Player player = this.f9608Oooo0O0;
        if (player == null) {
            z = false;
        } else {
            if (keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode == 90) {
                        if (player.Oooo0o() != 4) {
                            player.OoooOO0();
                        }
                    } else if (keyCode == 89) {
                        player.o000oOoO();
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode == 79 || keyCode == 85) {
                            if (o00.OoooO0(player)) {
                                o00.OooOooo(player);
                            } else {
                                o00.OooOooO(player);
                            }
                        } else if (keyCode == 87) {
                            player.OooOo();
                        } else if (keyCode == 88) {
                            player.OooOO0();
                        } else if (keyCode == 126) {
                            o00.OooOooo(player);
                        } else if (keyCode == 127) {
                            o00.OooOooO(player);
                        }
                    }
                }
                z = true;
            } else {
                z = false;
            }
        }
        return z || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f9595OooOo0o);
        } else if (motionEvent.getAction() == 1) {
            OooO0O0();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public Player getPlayer() {
        return this.f9608Oooo0O0;
    }

    public int getRepeatToggleModes() {
        return this.f9616OoooO00;
    }

    public boolean getShowShuffleButton() {
        return this.f9626o000oOoO;
    }

    public int getShowTimeoutMs() {
        return this.f9613Oooo0oo;
    }

    public boolean getShowVrButton() {
        View view = this.f9584OooOOO;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9609Oooo0OO = true;
        long j = this.f9619OoooOOO;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                OooO00o();
            } else {
                postDelayed(this.f9595OooOo0o, jUptimeMillis);
            }
        } else if (OooO0OO()) {
            OooO0O0();
        }
        OooO0o();
        OooO0o0();
        OooO0oo();
        OooO();
        OooOO0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9609Oooo0OO = false;
        removeCallbacks(this.f9594OooOo0O);
        removeCallbacks(this.f9595OooOo0o);
    }

    public void setPlayer(@Nullable Player player) {
        boolean z = true;
        p080o000OoO.o00Oo0.OooO0Oo(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.OooOo0O() != Looper.getMainLooper()) {
            z = false;
        }
        p080o000OoO.o00Oo0.OooO00o(z);
        Player player2 = this.f9608Oooo0O0;
        if (player2 == player) {
            return;
        }
        OooO0O0 oooO0O0 = this.f9576OooO0Oo;
        if (player2 != null) {
            player2.OooOOOO(oooO0O0);
        }
        this.f9608Oooo0O0 = player;
        if (player != null) {
            player.OooOOoo(oooO0O0);
        }
        OooO0o();
        OooO0o0();
        OooO0oo();
        OooO();
        OooOO0();
    }

    public void setProgressUpdateListener(@Nullable OooO0OO oooO0OO) {
    }

    public void setRepeatToggleModes(int i) {
        this.f9616OoooO00 = i;
        Player player = this.f9608Oooo0O0;
        if (player != null) {
            int iOoooO0 = player.OoooO0();
            if (i == 0 && iOoooO0 != 0) {
                this.f9608Oooo0O0.Oooo0oo(0);
            } else if (i == 1 && iOoooO0 == 2) {
                this.f9608Oooo0O0.Oooo0oo(1);
            } else if (i == 2 && iOoooO0 == 1) {
                this.f9608Oooo0O0.Oooo0oo(2);
            }
        }
        OooO0oo();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f9617OoooO0O = z;
        OooO0o0();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f9611Oooo0o0 = z;
        OooOO0();
    }

    public void setShowNextButton(boolean z) {
        this.f9618OoooOO0 = z;
        OooO0o0();
    }

    public void setShowPreviousButton(boolean z) {
        this.f9614OoooO = z;
        OooO0o0();
    }

    public void setShowRewindButton(boolean z) {
        this.f9615OoooO0 = z;
        OooO0o0();
    }

    public void setShowShuffleButton(boolean z) {
        this.f9626o000oOoO = z;
        OooO();
    }

    public void setShowTimeoutMs(int i) {
        this.f9613Oooo0oo = i;
        if (OooO0OO()) {
            OooO0O0();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.f9584OooOOO;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f9603Oooo = o00.OooO(i, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.f9584OooOOO;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            OooO0Oo(view, getShowVrButton(), onClickListener != null);
        }
    }

    public LegacyPlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.media3.ui.OooOO0] */
    public LegacyPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int resourceId = o0000Ooo.exo_legacy_player_control_view;
        this.f9613Oooo0oo = 5000;
        this.f9616OoooO00 = 0;
        this.f9603Oooo = 200;
        this.f9619OoooOOO = -9223372036854775807L;
        this.f9615OoooO0 = true;
        this.f9617OoooO0O = true;
        this.f9614OoooO = true;
        this.f9618OoooOO0 = true;
        this.f9626o000oOoO = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o0000O0.LegacyPlayerControlView, i, 0);
            try {
                this.f9613Oooo0oo = typedArrayObtainStyledAttributes.getInt(o0000O0.LegacyPlayerControlView_show_timeout, this.f9613Oooo0oo);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(o0000O0.LegacyPlayerControlView_controller_layout_id, resourceId);
                this.f9616OoooO00 = typedArrayObtainStyledAttributes.getInt(o0000O0.LegacyPlayerControlView_repeat_toggle_modes, this.f9616OoooO00);
                this.f9615OoooO0 = typedArrayObtainStyledAttributes.getBoolean(o0000O0.LegacyPlayerControlView_show_rewind_button, this.f9615OoooO0);
                this.f9617OoooO0O = typedArrayObtainStyledAttributes.getBoolean(o0000O0.LegacyPlayerControlView_show_fastforward_button, this.f9617OoooO0O);
                this.f9614OoooO = typedArrayObtainStyledAttributes.getBoolean(o0000O0.LegacyPlayerControlView_show_previous_button, this.f9614OoooO);
                this.f9618OoooOO0 = typedArrayObtainStyledAttributes.getBoolean(o0000O0.LegacyPlayerControlView_show_next_button, this.f9618OoooOO0);
                this.f9626o000oOoO = typedArrayObtainStyledAttributes.getBoolean(o0000O0.LegacyPlayerControlView_show_shuffle_button, this.f9626o000oOoO);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(o0000O0.LegacyPlayerControlView_time_bar_min_update_interval, this.f9603Oooo));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f9578OooO0o0 = new CopyOnWriteArrayList<>();
        this.f9593OooOo00 = new androidx.media3.common.Oooo0.OooO0O0();
        this.f9592OooOo0 = new androidx.media3.common.Oooo0.OooO0o();
        StringBuilder sb = new StringBuilder();
        this.f9588OooOOo = sb;
        this.f9590OooOOoo = new Formatter(sb, Locale.getDefault());
        this.f9620OoooOOo = new long[0];
        this.f9621OoooOo0 = new boolean[0];
        this.f9622OoooOoO = new long[0];
        this.f9623OoooOoo = new boolean[0];
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f9576OooO0Oo = oooO0O0;
        this.f9594OooOo0O = new Runnable() { // from class: androidx.media3.ui.OooOO0
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = LegacyPlayerControlView.f9574OooooO0;
                this.f9632OooO0Oo.OooO0oO();
            }
        };
        this.f9595OooOo0o = new o0O00O0o(this, 1);
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        int i2 = o00000O.exo_progress;
        o000O000 o000o001 = (o000O000) findViewById(i2);
        View viewFindViewById = findViewById(o00000O.exo_progress_placeholder);
        if (o000o001 != null) {
            this.f9589OooOOo0 = o000o001;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet);
            defaultTimeBar.setId(i2);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f9589OooOOo0 = defaultTimeBar;
        } else {
            this.f9589OooOOo0 = null;
        }
        this.f9586OooOOOO = (TextView) findViewById(o00000O.exo_duration);
        this.f9587OooOOOo = (TextView) findViewById(o00000O.exo_position);
        o000O000 o000o002 = this.f9589OooOOo0;
        if (o000o002 != null) {
            o000o002.OooO00o(oooO0O0);
        }
        View viewFindViewById2 = findViewById(o00000O.exo_play);
        this.f9580OooO0oo = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(oooO0O0);
        }
        View viewFindViewById3 = findViewById(o00000O.exo_pause);
        this.f9575OooO = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(oooO0O0);
        }
        View viewFindViewById4 = findViewById(o00000O.exo_prev);
        this.f9577OooO0o = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(oooO0O0);
        }
        View viewFindViewById5 = findViewById(o00000O.exo_next);
        this.f9579OooO0oO = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(oooO0O0);
        }
        View viewFindViewById6 = findViewById(o00000O.exo_rew);
        this.f9582OooOO0O = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(oooO0O0);
        }
        View viewFindViewById7 = findViewById(o00000O.exo_ffwd);
        this.f9581OooOO0 = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(oooO0O0);
        }
        ImageView imageView = (ImageView) findViewById(o00000O.exo_repeat_toggle);
        this.f9583OooOO0o = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(oooO0O0);
        }
        ImageView imageView2 = (ImageView) findViewById(o00000O.exo_shuffle);
        this.f9585OooOOO0 = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(oooO0O0);
        }
        View viewFindViewById8 = findViewById(o00000O.exo_vr);
        this.f9584OooOOO = viewFindViewById8;
        setShowVrButton(false);
        OooO0Oo(viewFindViewById8, false, false);
        Resources resources = context.getResources();
        this.f9605Oooo000 = resources.getInteger(o00000OO.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f9606Oooo00O = resources.getInteger(o00000OO.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.f9591OooOo = o00.OooOOo0(context, resources, o00000.exo_legacy_controls_repeat_off);
        this.f9597OooOoO0 = o00.OooOOo0(context, resources, o00000.exo_legacy_controls_repeat_one);
        this.f9596OooOoO = o00.OooOOo0(context, resources, o00000.exo_legacy_controls_repeat_all);
        this.f9601OooOooO = o00.OooOOo0(context, resources, o00000.exo_legacy_controls_shuffle_on);
        this.f9602OooOooo = o00.OooOOo0(context, resources, o00000.exo_legacy_controls_shuffle_off);
        this.f9598OooOoOO = resources.getString(o0000O00.exo_controls_repeat_off_description);
        this.f9600OooOoo0 = resources.getString(o0000O00.exo_controls_repeat_one_description);
        this.f9599OooOoo = resources.getString(o0000O00.exo_controls_repeat_all_description);
        this.f9607Oooo00o = resources.getString(o0000O00.exo_controls_shuffle_on_description);
        this.f9604Oooo0 = resources.getString(o0000O00.exo_controls_shuffle_off_description);
        this.f9625Ooooo0o = -9223372036854775807L;
    }
}
