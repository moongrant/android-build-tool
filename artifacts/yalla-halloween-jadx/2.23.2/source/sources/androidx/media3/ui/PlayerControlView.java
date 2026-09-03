package androidx.media3.ui;

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
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.util.RepeatModeUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class PlayerControlView extends FrameLayout {

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public static final float[] f9644o0OOO0o;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOO0 f9645OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O0O00 f9646OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0O0 f9647OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Resources f9648OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final CopyOnWriteArrayList<OooOOOO> f9649OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final RecyclerView f9650OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO0o f9651OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOO0O f9652OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooO00o f9653OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final PopupWindow f9654OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final androidx.media3.ui.OooO0o f9655OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f9656OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public final View f9657OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public final View f9658OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public final View f9659OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public final View f9660OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public final ImageView f9661OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public final TextView f9662OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public final View f9663OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public final TextView f9664OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public final ImageView f9665OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public final ImageView f9666OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public final View f9667OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public final ImageView f9668OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public final View f9669OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public final ImageView f9670OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public final View f9671OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public final View f9672OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final Drawable f9673Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final StringBuilder f9674Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public final TextView f9675Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public final TextView f9676Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @Nullable
    public final o000O000 f9677Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final Formatter f9678Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final androidx.media3.common.Oooo0.OooO0O0 f9679Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final androidx.media3.ui.OooOO0O f9680Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final androidx.media3.common.Oooo0.OooO0o f9681Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Drawable f9682Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Drawable f9683Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final Drawable f9684OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final String f9685OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final String f9686OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final String f9687OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final Drawable f9688OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final float f9689OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final String f9690OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final String f9691OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final Drawable f9692OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final Drawable f9693OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final String f9694Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final String f9695Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final Drawable f9696OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final Drawable f9697OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final String f9698OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    public Player f9699Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final String f9700Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @Nullable
    public OooO0OO f9701OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public boolean f9702Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final float f9703o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public boolean f9704o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public boolean f9705o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public int f9706o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public int f9707o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public final long[] f9708o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public boolean[] f9709o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public int f9710o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f9711o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public final boolean[] f9712o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public long f9713o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public boolean f9714o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public long[] f9715oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public boolean f9716ooOO;

    public interface OooO {
    }

    public final class OooO00o extends OooOOO {
        public OooO00o() {
            super();
        }

        @Override // androidx.media3.ui.PlayerControlView.OooOOO
        public final void OooO0O0(SubSettingViewHolder subSettingViewHolder) {
            subSettingViewHolder.textView.setText(o0000O00.exo_track_selection_auto);
            Player player = PlayerControlView.this.f9699Oooooo;
            player.getClass();
            subSettingViewHolder.checkView.setVisibility(OooO0Oo(player.OooOo0o()) ? 4 : 0);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.OooOo00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView playerControlView = PlayerControlView.this;
                    Player player2 = playerControlView.f9699Oooooo;
                    if (player2 == null || !player2.OooOOo0(29)) {
                        return;
                    }
                    androidx.media3.common.o00O0O o00o0oOooOo0o = playerControlView.f9699Oooooo.OooOo0o();
                    Player player3 = playerControlView.f9699Oooooo;
                    int i = o00.f34910OooO00o;
                    player3.Oooo(o00o0oOooOo0o.OooO0OO().OooO0O0(1).OooO0oO(1).OooO00o());
                    playerControlView.f9645OooO.f9724OooO0O0[1] = playerControlView.getResources().getString(o0000O00.exo_track_selection_auto);
                    playerControlView.f9654OooOOO.dismiss();
                }
            });
        }

        @Override // androidx.media3.ui.PlayerControlView.OooOOO
        public final void OooO0OO(String str) {
            PlayerControlView.this.f9645OooO.f9724OooO0O0[1] = str;
        }

        public final boolean OooO0Oo(androidx.media3.common.o00O0O o00o0o2) {
            for (int i = 0; i < this.f9728OooO00o.size(); i++) {
                if (o00o0o2.f6822OooOoo0.containsKey(this.f9728OooO00o.get(i).f9730OooO00o.f6860OooO0o0)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final class OooO0O0 implements Player.OooO0OO, o000O000.OooO00o, View.OnClickListener, PopupWindow.OnDismissListener {
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
            PlayerControlView playerControlView = PlayerControlView.this;
            Player player = playerControlView.f9699Oooooo;
            if (player == null) {
                return;
            }
            o0O0O00 o0o0o00 = playerControlView.f9646OooO0Oo;
            o0o0o00.OooO0oO();
            if (playerControlView.f9659OooOOo0 == view) {
                if (player.OooOOo0(9)) {
                    player.OooOo();
                    return;
                }
                return;
            }
            if (playerControlView.f9657OooOOOo == view) {
                if (player.OooOOo0(7)) {
                    player.OooOO0();
                    return;
                }
                return;
            }
            if (playerControlView.f9660OooOOoo == view) {
                if (player.Oooo0o() == 4 || !player.OooOOo0(12)) {
                    return;
                }
                player.OoooOO0();
                return;
            }
            if (playerControlView.f9663OooOo00 == view) {
                if (player.OooOOo0(11)) {
                    player.o000oOoO();
                    return;
                }
                return;
            }
            if (playerControlView.f9658OooOOo == view) {
                if (o00.OoooO0(player)) {
                    o00.OooOooo(player);
                    return;
                } else {
                    o00.OooOooO(player);
                    return;
                }
            }
            if (playerControlView.f9665OooOo0o == view) {
                if (player.OooOOo0(15)) {
                    player.Oooo0oo(RepeatModeUtil.OooO00o(player.OoooO0(), playerControlView.f9710o00ooo));
                    return;
                }
                return;
            }
            if (playerControlView.f9661OooOo == view) {
                if (player.OooOOo0(14)) {
                    player.OooOoo0(!player.OoooO0O());
                    return;
                }
                return;
            }
            View view2 = playerControlView.f9669OooOoo;
            if (view2 == view) {
                o0o0o00.OooO0o();
                playerControlView.OooO0o0(playerControlView.f9645OooO, view2);
                return;
            }
            View view3 = playerControlView.f9671OooOooO;
            if (view3 == view) {
                o0o0o00.OooO0o();
                playerControlView.OooO0o0(playerControlView.f9651OooOO0, view3);
                return;
            }
            View view4 = playerControlView.f9672OooOooo;
            if (view4 == view) {
                o0o0o00.OooO0o();
                playerControlView.OooO0o0(playerControlView.f9653OooOO0o, view4);
                return;
            }
            ImageView imageView = playerControlView.f9666OooOoO;
            if (imageView == view) {
                o0o0o00.OooO0o();
                playerControlView.OooO0o0(playerControlView.f9652OooOO0O, imageView);
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

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            PlayerControlView playerControlView = PlayerControlView.this;
            if (playerControlView.f9714o0ooOoO) {
                playerControlView.f9646OooO0Oo.OooO0oO();
            }
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final void onEvents(Player player, Player.OooO0O0 oooO0O0) {
            androidx.media3.common.OooO oooO = oooO0O0.f6706OooO00o;
            boolean zOooO00o = oooO.OooO00o(4, 5, 13);
            PlayerControlView playerControlView = PlayerControlView.this;
            if (zOooO00o) {
                float[] fArr = PlayerControlView.f9644o0OOO0o;
                playerControlView.OooOOO0();
            }
            if (oooO.OooO00o(4, 5, 7, 13)) {
                float[] fArr2 = PlayerControlView.f9644o0OOO0o;
                playerControlView.OooOOOO();
            }
            if (oooO.OooO00o(8, 13)) {
                float[] fArr3 = PlayerControlView.f9644o0OOO0o;
                playerControlView.OooOOOo();
            }
            if (oooO.OooO00o(9, 13)) {
                float[] fArr4 = PlayerControlView.f9644o0OOO0o;
                playerControlView.OooOOo();
            }
            if (oooO.OooO00o(8, 9, 11, 0, 16, 17, 13)) {
                float[] fArr5 = PlayerControlView.f9644o0OOO0o;
                playerControlView.OooOO0o();
            }
            if (oooO.OooO00o(11, 0, 13)) {
                float[] fArr6 = PlayerControlView.f9644o0OOO0o;
                playerControlView.OooOOoo();
            }
            if (oooO.OooO00o(12, 13)) {
                float[] fArr7 = PlayerControlView.f9644o0OOO0o;
                playerControlView.OooOOO();
            }
            if (oooO.OooO00o(2, 13)) {
                float[] fArr8 = PlayerControlView.f9644o0OOO0o;
                playerControlView.OooOo00();
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
            PlayerControlView playerControlView = PlayerControlView.this;
            TextView textView = playerControlView.f9676Oooo00O;
            if (textView != null) {
                textView.setText(o00.OooOoO0(playerControlView.f9674Oooo0, playerControlView.f9678Oooo0O0, j));
            }
        }

        @Override // androidx.media3.ui.o000O000.OooO00o
        public final void onScrubStart(o000O000 o000o001, long j) {
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.f9705o00Oo0 = true;
            TextView textView = playerControlView.f9676Oooo00O;
            if (textView != null) {
                textView.setText(o00.OooOoO0(playerControlView.f9674Oooo0, playerControlView.f9678Oooo0O0, j));
            }
            playerControlView.f9646OooO0Oo.OooO0o();
        }

        @Override // androidx.media3.ui.o000O000.OooO00o
        public final void onScrubStop(o000O000 o000o001, long j, boolean z) {
            Player player;
            PlayerControlView playerControlView = PlayerControlView.this;
            int i = 0;
            playerControlView.f9705o00Oo0 = false;
            if (!z && (player = playerControlView.f9699Oooooo) != null) {
                if (playerControlView.f9704o00O0O) {
                    if (player.OooOOo0(17) && player.OooOOo0(10)) {
                        androidx.media3.common.Oooo0 oooo0OooOo0 = player.OooOo0();
                        int iOooOOoo = oooo0OooOo0.OooOOoo();
                        while (true) {
                            long jOooO0OO = oooo0OooOo0.OooOOo0(i, playerControlView.f9681Oooo0o0).OooO0OO();
                            if (j < jOooO0OO) {
                                break;
                            }
                            if (i == iOooOOoo - 1) {
                                j = jOooO0OO;
                                break;
                            } else {
                                j -= jOooO0OO;
                                i++;
                            }
                        }
                        player.OooOoO(i, j);
                    }
                } else if (player.OooOOo0(5)) {
                    player.Oooo0(j);
                }
                playerControlView.OooOOOO();
            }
            playerControlView.f9646OooO0Oo.OooO0oO();
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

    @Deprecated
    public interface OooO0OO {
    }

    public final class OooO0o extends RecyclerView.Adapter<SubSettingViewHolder> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String[] f9719OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float[] f9720OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f9721OooO0OO;

        public OooO0o(String[] strArr, float[] fArr) {
            this.f9719OooO00o = strArr;
            this.f9720OooO0O0 = fArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f9719OooO00o.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.o0O0O00 o0o0o00, final int i) {
            SubSettingViewHolder subSettingViewHolder = (SubSettingViewHolder) o0o0o00;
            String[] strArr = this.f9719OooO00o;
            if (i < strArr.length) {
                subSettingViewHolder.textView.setText(strArr[i]);
            }
            if (i == this.f9721OooO0OO) {
                subSettingViewHolder.itemView.setSelected(true);
                subSettingViewHolder.checkView.setVisibility(0);
            } else {
                subSettingViewHolder.itemView.setSelected(false);
                subSettingViewHolder.checkView.setVisibility(4);
            }
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.OooOo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.OooO0o oooO0o = this.f9639OooO0Oo;
                    int i2 = oooO0o.f9721OooO0OO;
                    int i3 = i;
                    PlayerControlView playerControlView = PlayerControlView.this;
                    if (i3 != i2) {
                        playerControlView.setPlaybackSpeed(oooO0o.f9720OooO0O0[i3]);
                    }
                    playerControlView.f9654OooOOO.dismiss();
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(o0000Ooo.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    public class OooOO0 extends RecyclerView.Adapter<SettingViewHolder> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String[] f9723OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String[] f9724OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Drawable[] f9725OooO0OO;

        public OooOO0(String[] strArr, Drawable[] drawableArr) {
            this.f9723OooO00o = strArr;
            this.f9724OooO0O0 = new String[strArr.length];
            this.f9725OooO0OO = drawableArr;
        }

        public final boolean OooO00o(int i) {
            PlayerControlView playerControlView = PlayerControlView.this;
            Player player = playerControlView.f9699Oooooo;
            if (player == null) {
                return false;
            }
            if (i == 0) {
                return player.OooOOo0(13);
            }
            if (i != 1) {
                return true;
            }
            return player.OooOOo0(30) && playerControlView.f9699Oooooo.OooOOo0(29);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f9723OooO00o.length;
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
            settingViewHolder.mainTextView.setText(this.f9723OooO00o[i]);
            String[] strArr = this.f9724OooO0O0;
            if (strArr[i] == null) {
                settingViewHolder.subTextView.setVisibility(8);
            } else {
                settingViewHolder.subTextView.setText(strArr[i]);
            }
            Drawable[] drawableArr = this.f9725OooO0OO;
            if (drawableArr[i] == null) {
                settingViewHolder.iconView.setVisibility(8);
            } else {
                settingViewHolder.iconView.setImageDrawable(drawableArr[i]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup viewGroup, int i) {
            PlayerControlView playerControlView = PlayerControlView.this;
            return playerControlView.new SettingViewHolder(LayoutInflater.from(playerControlView.getContext()).inflate(o0000Ooo.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    public final class OooOO0O extends OooOOO {
        public OooOO0O() {
            super();
        }

        @Override // androidx.media3.ui.PlayerControlView.OooOOO, androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
            super.onBindViewHolder(subSettingViewHolder, i);
            if (i > 0) {
                OooOOO0 oooOOO0 = this.f9728OooO00o.get(i - 1);
                subSettingViewHolder.checkView.setVisibility(oooOOO0.f9730OooO00o.f6862OooO0oo[oooOOO0.f9731OooO0O0] ? 0 : 4);
            }
        }

        @Override // androidx.media3.ui.PlayerControlView.OooOOO
        public final void OooO0O0(SubSettingViewHolder subSettingViewHolder) {
            boolean z;
            subSettingViewHolder.textView.setText(o0000O00.exo_track_selection_none);
            int i = 0;
            while (true) {
                if (i >= this.f9728OooO00o.size()) {
                    z = true;
                    break;
                }
                OooOOO0 oooOOO0 = this.f9728OooO00o.get(i);
                if (oooOOO0.f9730OooO00o.f6862OooO0oo[oooOOO0.f9731OooO0O0]) {
                    z = false;
                    break;
                }
                i++;
            }
            subSettingViewHolder.checkView.setVisibility(z ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.Oooo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView playerControlView = PlayerControlView.this;
                    Player player = playerControlView.f9699Oooooo;
                    if (player == null || !player.OooOOo0(29)) {
                        return;
                    }
                    playerControlView.f9699Oooooo.Oooo(playerControlView.f9699Oooooo.OooOo0o().OooO0OO().OooO0O0(3).OooO0o0().OooO00o());
                    playerControlView.f9654OooOOO.dismiss();
                }
            });
        }

        @Override // androidx.media3.ui.PlayerControlView.OooOOO
        public final void OooO0OO(String str) {
        }

        public final void OooO0Oo(List<OooOOO0> list) {
            boolean z = false;
            for (int i = 0; i < ((o0O00) list).f19062OooO0oO; i++) {
                OooOOO0 oooOOO0 = (OooOOO0) ((o0O00) list).get(i);
                if (oooOOO0.f9730OooO00o.f6862OooO0oo[oooOOO0.f9731OooO0O0]) {
                    z = true;
                    break;
                }
            }
            PlayerControlView playerControlView = PlayerControlView.this;
            ImageView imageView = playerControlView.f9666OooOoO;
            if (imageView != null) {
                imageView.setImageDrawable(z ? playerControlView.f9692OoooOoO : playerControlView.f9693OoooOoo);
                playerControlView.f9666OooOoO.setContentDescription(z ? playerControlView.f9694Ooooo00 : playerControlView.f9695Ooooo0o);
            }
            this.f9728OooO00o = list;
        }
    }

    public abstract class OooOOO extends RecyclerView.Adapter<SubSettingViewHolder> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public List<OooOOO0> f9728OooO00o = new ArrayList();

        public OooOOO() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OooO00o */
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
            final Player player = PlayerControlView.this.f9699Oooooo;
            if (player == null) {
                return;
            }
            if (i == 0) {
                OooO0O0(subSettingViewHolder);
                return;
            }
            final OooOOO0 oooOOO0 = this.f9728OooO00o.get(i - 1);
            final androidx.media3.common.o000oOoO o000oooo2 = oooOOO0.f9730OooO00o.f6860OooO0o0;
            boolean z = player.OooOo0o().f6822OooOoo0.get(o000oooo2) != null && oooOOO0.f9730OooO00o.f6862OooO0oo[oooOOO0.f9731OooO0O0];
            subSettingViewHolder.textView.setText(oooOOO0.f9732OooO0OO);
            subSettingViewHolder.checkView.setVisibility(z ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.o000oOoO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.OooOOO oooOOO = this.f9842OooO0Oo;
                    oooOOO.getClass();
                    Player player2 = player;
                    if (player2.OooOOo0(29)) {
                        androidx.media3.common.o00O0O.OooO00o oooO00oOooO0OO = player2.OooOo0o().OooO0OO();
                        PlayerControlView.OooOOO0 oooOOO1 = oooOOO0;
                        player2.Oooo(oooO00oOooO0OO.OooO0o(new androidx.media3.common.o0OoOo0(o000oooo2, ImmutableList.OooOOOo(Integer.valueOf(oooOOO1.f9731OooO0O0)))).OooO0oO(oooOOO1.f9730OooO00o.f6860OooO0o0.f6766OooO0o).OooO00o());
                        oooOOO.OooO0OO(oooOOO1.f9732OooO0OO);
                        PlayerControlView.this.f9654OooOOO.dismiss();
                    }
                }
            });
        }

        public abstract void OooO0O0(SubSettingViewHolder subSettingViewHolder);

        public abstract void OooO0OO(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            if (this.f9728OooO00o.isEmpty()) {
                return 0;
            }
            return this.f9728OooO00o.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(o0000Ooo.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    public static final class OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final androidx.media3.common.o00Oo0.OooO00o f9730OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f9731OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f9732OooO0OO;

        public OooOOO0(androidx.media3.common.o00Oo0 o00oo1, int i, int i2, String str) {
            this.f9730OooO00o = o00oo1.OooO0OO().get(i);
            this.f9731OooO0O0 = i2;
            this.f9732OooO0OO = str;
        }
    }

    @Deprecated
    public interface OooOOOO {
        void OooOO0O(int i);
    }

    public final class SettingViewHolder extends RecyclerView.o0O0O00 {
        private final ImageView iconView;
        private final TextView mainTextView;
        private final TextView subTextView;

        public SettingViewHolder(View view) {
            super(view);
            if (o00.f34910OooO00o < 26) {
                view.setFocusable(true);
            }
            this.mainTextView = (TextView) view.findViewById(o00000O.exo_main_text);
            this.subTextView = (TextView) view.findViewById(o00000O.exo_sub_text);
            this.iconView = (ImageView) view.findViewById(o00000O.exo_icon);
            view.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.Oooo000
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f9643OooO0Oo.lambda$new$0(view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$new$0(View view) {
            PlayerControlView playerControlView = PlayerControlView.this;
            int adapterPosition = getAdapterPosition();
            View view2 = playerControlView.f9669OooOoo;
            if (adapterPosition == 0) {
                view2.getClass();
                playerControlView.OooO0o0(playerControlView.f9651OooOO0, view2);
            } else if (adapterPosition != 1) {
                playerControlView.f9654OooOOO.dismiss();
            } else {
                view2.getClass();
                playerControlView.OooO0o0(playerControlView.f9653OooOO0o, view2);
            }
        }
    }

    public static class SubSettingViewHolder extends RecyclerView.o0O0O00 {
        public final View checkView;
        public final TextView textView;

        public SubSettingViewHolder(View view) {
            super(view);
            if (o00.f34910OooO00o < 26) {
                view.setFocusable(true);
            }
            this.textView = (TextView) view.findViewById(o00000O.exo_text);
            this.checkView = view.findViewById(o00000O.exo_check);
        }
    }

    static {
        p069o0000ooO.o0000.OooO00o("media3.ui");
        f9644o0OOO0o = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    public static void OooO00o(PlayerControlView playerControlView) {
        if (playerControlView.f9701OoooooO == null) {
            return;
        }
        boolean z = !playerControlView.f9702Ooooooo;
        playerControlView.f9702Ooooooo = z;
        String str = playerControlView.f9698OooooOo;
        Drawable drawable = playerControlView.f9696OooooO0;
        String str2 = playerControlView.f9700Oooooo0;
        Drawable drawable2 = playerControlView.f9697OooooOO;
        ImageView imageView = playerControlView.f9668OooOoOO;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            }
        }
        boolean z2 = playerControlView.f9702Ooooooo;
        ImageView imageView2 = playerControlView.f9670OooOoo0;
        if (imageView2 != null) {
            if (z2) {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            } else {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            }
        }
        OooO0OO oooO0OO = playerControlView.f9701OoooooO;
        if (oooO0OO != null) {
            PlayerView.this.getClass();
        }
    }

    public static boolean OooO0OO(Player player, androidx.media3.common.Oooo0.OooO0o oooO0o) {
        androidx.media3.common.Oooo0 oooo0OooOo0;
        int iOooOOoo;
        if (!player.OooOOo0(17) || (iOooOOoo = (oooo0OooOo0 = player.OooOo0()).OooOOoo()) <= 1 || iOooOOoo > 100) {
            return false;
        }
        for (int i = 0; i < iOooOOoo; i++) {
            if (oooo0OooOo0.OooOOo0(i, oooO0o).f6682OooOOo0 == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        Player player = this.f9699Oooooo;
        if (player == null || !player.OooOOo0(13)) {
            return;
        }
        Player player2 = this.f9699Oooooo;
        player2.OooO00o(new androidx.media3.common.OooOOOO(f, player2.OooO0O0().f6621OooO0o0));
    }

    public final boolean OooO() {
        return getVisibility() == 0;
    }

    public final boolean OooO0Oo(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.f9699Oooooo;
        if (player != null) {
            if (keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode == 90) {
                        if (player.Oooo0o() != 4 && player.OooOOo0(12)) {
                            player.OoooOO0();
                        }
                    } else if (keyCode == 89 && player.OooOOo0(11)) {
                        player.o000oOoO();
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode == 79 || keyCode == 85) {
                            if (o00.OoooO0(player)) {
                                o00.OooOooo(player);
                            } else {
                                o00.OooOooO(player);
                            }
                        } else if (keyCode != 87) {
                            if (keyCode != 88) {
                                if (keyCode == 126) {
                                    o00.OooOooo(player);
                                } else if (keyCode == 127) {
                                    o00.OooOooO(player);
                                }
                            } else if (player.OooOOo0(7)) {
                                player.OooOO0();
                            }
                        } else if (player.OooOOo0(9)) {
                            player.OooOo();
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final o0O00 OooO0o(androidx.media3.common.o00Oo0 o00oo1, int i) {
        ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
        ImmutableList<androidx.media3.common.o00Oo0.OooO00o> immutableList = o00oo1.f6852OooO0Oo;
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            androidx.media3.common.o00Oo0.OooO00o oooO00o2 = immutableList.get(i2);
            if (oooO00o2.f6860OooO0o0.f6766OooO0o == i) {
                for (int i3 = 0; i3 < oooO00o2.f6858OooO0Oo; i3++) {
                    if (oooO00o2.OooO0o(i3)) {
                        androidx.media3.common.OooOO0 oooOO1 = oooO00o2.f6860OooO0o0.f6768OooO0oO[i3];
                        if ((oooOO1.f6405OooO0oO & 2) == 0) {
                            oooO00o.OooO0OO(new OooOOO0(o00oo1, i2, i3, this.f9655OooOOO0.OooO00o(oooOO1)));
                        }
                    }
                }
            }
        }
        return oooO00o.OooO0oo();
    }

    public final void OooO0o0(RecyclerView.Adapter<?> adapter, View view) {
        this.f9650OooO0oo.setAdapter(adapter);
        OooOOo0();
        this.f9714o0ooOoO = false;
        PopupWindow popupWindow = this.f9654OooOOO;
        popupWindow.dismiss();
        this.f9714o0ooOoO = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.f9656OooOOOO;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    public final void OooO0oO() {
        o0O0O00 o0o0o00 = this.f9646OooO0Oo;
        int i = o0o0o00.f9875OooOoO;
        if (i == 3 || i == 2) {
            return;
        }
        o0o0o00.OooO0o();
        if (!o0o0o00.f9878OooOoo) {
            o0o0o00.OooO(2);
        } else if (o0o0o00.f9875OooOoO == 1) {
            o0o0o00.f9864OooOOO0.start();
        } else {
            o0o0o00.f9863OooOOO.start();
        }
    }

    public final boolean OooO0oo() {
        o0O0O00 o0o0o00 = this.f9646OooO0Oo;
        return o0o0o00.f9875OooOoO == 0 && o0o0o00.f9852OooO00o.OooO();
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
        view.setAlpha(z ? this.f9703o000oOoO : this.f9689OoooOOO);
    }

    public final void OooOO0o() {
        boolean zOooOOo0;
        boolean zOooOOo1;
        boolean zOooOOo2;
        boolean zOooOOo3;
        boolean zOooOOo4;
        if (OooO() && this.f9711o0OoOo0) {
            Player player = this.f9699Oooooo;
            if (player != null) {
                zOooOOo1 = (this.f9716ooOO && OooO0OO(player, this.f9681Oooo0o0)) ? player.OooOOo0(10) : player.OooOOo0(5);
                zOooOOo2 = player.OooOOo0(7);
                zOooOOo3 = player.OooOOo0(11);
                zOooOOo4 = player.OooOOo0(12);
                zOooOOo0 = player.OooOOo0(9);
            } else {
                zOooOOo0 = false;
                zOooOOo1 = false;
                zOooOOo2 = false;
                zOooOOo3 = false;
                zOooOOo4 = false;
            }
            Resources resources = this.f9648OooO0o0;
            View view = this.f9663OooOo00;
            if (zOooOOo3) {
                Player player2 = this.f9699Oooooo;
                int iOoooOOo = (int) ((player2 != null ? player2.OoooOOo() : 5000L) / 1000);
                TextView textView = this.f9664OooOo0O;
                if (textView != null) {
                    textView.setText(String.valueOf(iOoooOOo));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(o0000.exo_controls_rewind_by_amount_description, iOoooOOo, Integer.valueOf(iOoooOOo)));
                }
            }
            View view2 = this.f9660OooOOoo;
            if (zOooOOo4) {
                Player player3 = this.f9699Oooooo;
                int iOooo0O0 = (int) ((player3 != null ? player3.Oooo0O0() : 15000L) / 1000);
                TextView textView2 = this.f9662OooOo0;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iOooo0O0));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(o0000.exo_controls_fastforward_by_amount_description, iOooo0O0, Integer.valueOf(iOooo0O0)));
                }
            }
            OooOO0O(this.f9657OooOOOo, zOooOOo2);
            OooOO0O(view, zOooOOo3);
            OooOO0O(view2, zOooOOo4);
            OooOO0O(this.f9659OooOOo0, zOooOOo0);
            o000O000 o000o001 = this.f9677Oooo00o;
            if (o000o001 != null) {
                o000o001.setEnabled(zOooOOo1);
            }
        }
    }

    public final void OooOOO() {
        OooO0o oooO0o;
        Player player = this.f9699Oooooo;
        if (player == null) {
            return;
        }
        float f = player.OooO0O0().f6619OooO0Oo;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            oooO0o = this.f9651OooOO0;
            float[] fArr = oooO0o.f9720OooO0O0;
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
        oooO0o.f9721OooO0OO = i2;
        String str = oooO0o.f9719OooO00o[i2];
        OooOO0 oooOO1 = this.f9645OooO;
        oooOO1.f9724OooO0O0[0] = str;
        OooOO0O(this.f9669OooOoo, oooOO1.OooO00o(1) || oooOO1.OooO00o(0));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    public final void OooOOO0() {
        View view;
        boolean z;
        if (OooO() && this.f9711o0OoOo0 && (view = this.f9658OooOOo) != null) {
            boolean zOoooO0 = o00.OoooO0(this.f9699Oooooo);
            int i = zOoooO0 ? o00000.exo_styled_controls_play : o00000.exo_styled_controls_pause;
            int i2 = zOoooO0 ? o0000O00.exo_controls_play_description : o0000O00.exo_controls_pause_description;
            Context context = getContext();
            Resources resources = this.f9648OooO0o0;
            ((ImageView) view).setImageDrawable(o00.OooOOo0(context, resources, i));
            view.setContentDescription(resources.getString(i2));
            Player player = this.f9699Oooooo;
            if (player != null) {
                z = true;
                if (!player.OooOOo0(1) || (this.f9699Oooooo.OooOOo0(17) && this.f9699Oooooo.OooOo0().OooOo00())) {
                    z = false;
                }
            } else {
                z = false;
            }
            OooOO0O(view, z);
        }
    }

    public final void OooOOOO() {
        long jOooo0OO;
        long jOoooO;
        if (OooO() && this.f9711o0OoOo0) {
            Player player = this.f9699Oooooo;
            if (player == null || !player.OooOOo0(16)) {
                jOooo0OO = 0;
                jOoooO = 0;
            } else {
                jOooo0OO = player.Oooo0OO() + this.f9713o0ooOOo;
                jOoooO = player.OoooO() + this.f9713o0ooOOo;
            }
            TextView textView = this.f9676Oooo00O;
            if (textView != null && !this.f9705o00Oo0) {
                textView.setText(o00.OooOoO0(this.f9674Oooo0, this.f9678Oooo0O0, jOooo0OO));
            }
            o000O000 o000o001 = this.f9677Oooo00o;
            if (o000o001 != null) {
                o000o001.setPosition(jOooo0OO);
                o000o001.setBufferedPosition(jOoooO);
            }
            androidx.media3.ui.OooOO0O oooOO0O = this.f9680Oooo0o;
            removeCallbacks(oooOO0O);
            int iOooo0o = player == null ? 1 : player.Oooo0o();
            if (player != null && player.isPlaying()) {
                long jMin = Math.min(o000o001 != null ? o000o001.getPreferredUpdateDelay() : 1000L, 1000 - (jOooo0OO % 1000));
                float f = player.OooO0O0().f6619OooO0Oo;
                postDelayed(oooOO0O, o00.OooOO0(f > 0.0f ? (long) (jMin / f) : 1000L, this.f9707o00o0O, 1000L));
            } else {
                if (iOooo0o == 4 || iOooo0o == 1) {
                    return;
                }
                postDelayed(oooOO0O, 1000L);
            }
        }
    }

    public final void OooOOOo() {
        ImageView imageView;
        if (OooO() && this.f9711o0OoOo0 && (imageView = this.f9665OooOo0o) != null) {
            if (this.f9710o00ooo == 0) {
                OooOO0O(imageView, false);
                return;
            }
            Player player = this.f9699Oooooo;
            String str = this.f9686OoooO00;
            Drawable drawable = this.f9682Oooo0oO;
            if (player == null || !player.OooOOo0(15)) {
                OooOO0O(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            OooOO0O(imageView, true);
            int iOoooO0 = player.OoooO0();
            if (iOoooO0 == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iOoooO0 == 1) {
                imageView.setImageDrawable(this.f9683Oooo0oo);
                imageView.setContentDescription(this.f9685OoooO0);
            } else {
                if (iOoooO0 != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f9673Oooo);
                imageView.setContentDescription(this.f9687OoooO0O);
            }
        }
    }

    public final void OooOOo() {
        ImageView imageView;
        if (OooO() && this.f9711o0OoOo0 && (imageView = this.f9661OooOo) != null) {
            Player player = this.f9699Oooooo;
            if (!this.f9646OooO0Oo.OooO0OO(imageView)) {
                OooOO0O(imageView, false);
                return;
            }
            String str = this.f9691OoooOo0;
            Drawable drawable = this.f9688OoooOO0;
            if (player == null || !player.OooOOo0(14)) {
                OooOO0O(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            OooOO0O(imageView, true);
            if (player.OoooO0O()) {
                drawable = this.f9684OoooO;
            }
            imageView.setImageDrawable(drawable);
            if (player.OoooO0O()) {
                str = this.f9690OoooOOo;
            }
            imageView.setContentDescription(str);
        }
    }

    public final void OooOOo0() {
        RecyclerView recyclerView = this.f9650OooO0oo;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.f9656OooOOOO;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.f9654OooOOO;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0152  */
    public final void OooOOoo() {
        long jOooo0OO;
        long j;
        int i;
        androidx.media3.common.Oooo0 oooo0;
        androidx.media3.common.Oooo0 oooo1;
        boolean z;
        boolean z2;
        Player player = this.f9699Oooooo;
        if (player == null) {
            return;
        }
        boolean z3 = this.f9716ooOO;
        boolean z4 = true;
        androidx.media3.common.Oooo0.OooO0o oooO0o = this.f9681Oooo0o0;
        this.f9704o00O0O = z3 && OooO0OO(player, oooO0o);
        this.f9713o0ooOOo = 0L;
        androidx.media3.common.Oooo0 oooo0OooOo0 = player.OooOOo0(17) ? player.OooOo0() : androidx.media3.common.Oooo0.f6629OooO0Oo;
        long j2 = -9223372036854775807L;
        if (oooo0OooOo0.OooOo00()) {
            if (player.OooOOo0(16)) {
                long jOooOoo = player.OooOoo();
                if (jOooOoo != -9223372036854775807L) {
                    jOooo0OO = o00.Oooo0OO(jOooOoo);
                } else {
                    jOooo0OO = 0;
                }
            } else {
                jOooo0OO = 0;
            }
            j = jOooo0OO;
            i = 0;
        } else {
            int iOooo0oO = player.Oooo0oO();
            boolean z5 = this.f9704o00O0O;
            int i2 = z5 ? 0 : iOooo0oO;
            int iOooOOoo = z5 ? oooo0OooOo0.OooOOoo() - 1 : iOooo0oO;
            j = 0;
            i = 0;
            while (i2 <= iOooOOoo) {
                if (i2 == iOooo0oO) {
                    this.f9713o0ooOOo = o00.o000oOoO(j);
                }
                oooo0OooOo0.OooOOo0(i2, oooO0o);
                if (oooO0o.f6682OooOOo0 == j2) {
                    p080o000OoO.o00Oo0.OooO0Oo(this.f9704o00O0O ^ z4);
                    break;
                }
                int i3 = oooO0o.f6681OooOOo;
                while (i3 <= oooO0o.f6683OooOOoo) {
                    androidx.media3.common.Oooo0.OooO0O0 oooO0O0 = this.f9679Oooo0OO;
                    oooo0OooOo0.OooO(i3, oooO0O0);
                    AdPlaybackState adPlaybackState = oooO0O0.f6646OooOO0;
                    int i4 = adPlaybackState.f6188OooO0oo;
                    while (i4 < adPlaybackState.f6186OooO0o0) {
                        long jOooO0oO = oooO0O0.OooO0oO(i4);
                        int i5 = iOooo0oO;
                        if (jOooO0oO == Long.MIN_VALUE) {
                            oooo0 = oooo0OooOo0;
                            long j3 = oooO0O0.f6644OooO0oO;
                            if (j3 == j2) {
                                oooo1 = oooo0;
                            } else {
                                jOooO0oO = j3;
                            }
                            i4++;
                            iOooo0oO = i5;
                            oooo0OooOo0 = oooo1;
                            j2 = -9223372036854775807L;
                        } else {
                            oooo0 = oooo0OooOo0;
                        }
                        long j4 = jOooO0oO + oooO0O0.f6645OooO0oo;
                        if (j4 >= 0) {
                            long[] jArr = this.f9715oo000o;
                            if (i == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.f9715oo000o = Arrays.copyOf(jArr, length);
                                this.f9709o00oO0o = Arrays.copyOf(this.f9709o00oO0o, length);
                            }
                            this.f9715oo000o[i] = o00.o000oOoO(j + j4);
                            boolean[] zArr = this.f9709o00oO0o;
                            AdPlaybackState.OooO00o oooO00oOooO0OO = oooO0O0.f6646OooOO0.OooO0OO(i4);
                            int i6 = oooO00oOooO0OO.f6201OooO0o0;
                            if (i6 == -1) {
                                oooo1 = oooo0;
                            } else {
                                int i7 = 0;
                                while (true) {
                                    oooo1 = oooo0;
                                    if (i7 < i6) {
                                        int i8 = oooO00oOooO0OO.f6203OooO0oo[i7];
                                        if (i8 != 0) {
                                            AdPlaybackState.OooO00o oooO00o = oooO00oOooO0OO;
                                            z = true;
                                            if (i8 != 1) {
                                                i7++;
                                                oooo0 = oooo1;
                                                oooO00oOooO0OO = oooO00o;
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
                            oooo1 = oooo0;
                        }
                        i4++;
                        iOooo0oO = i5;
                        oooo0OooOo0 = oooo1;
                        j2 = -9223372036854775807L;
                    }
                    i3++;
                    z4 = true;
                    oooo0OooOo0 = oooo0OooOo0;
                    j2 = -9223372036854775807L;
                }
                j += oooO0o.f6682OooOOo0;
                i2++;
                z4 = z4;
                oooo0OooOo0 = oooo0OooOo0;
                j2 = -9223372036854775807L;
            }
        }
        long jO000oOoO = o00.o000oOoO(j);
        TextView textView = this.f9675Oooo000;
        if (textView != null) {
            textView.setText(o00.OooOoO0(this.f9674Oooo0, this.f9678Oooo0O0, jO000oOoO));
        }
        o000O000 o000o001 = this.f9677Oooo00o;
        if (o000o001 != null) {
            o000o001.setDuration(jO000oOoO);
            long[] jArr2 = this.f9708o00oO0O;
            int length2 = jArr2.length;
            int i9 = i + length2;
            long[] jArr3 = this.f9715oo000o;
            if (i9 > jArr3.length) {
                this.f9715oo000o = Arrays.copyOf(jArr3, i9);
                this.f9709o00oO0o = Arrays.copyOf(this.f9709o00oO0o, i9);
            }
            System.arraycopy(jArr2, 0, this.f9715oo000o, i, length2);
            System.arraycopy(this.f9712o0ooOO0, 0, this.f9709o00oO0o, i, length2);
            o000o001.OooO0O0(this.f9715oo000o, this.f9709o00oO0o, i9);
        }
        OooOOOO();
    }

    public final void OooOo00() {
        OooOO0O oooOO0O = this.f9652OooOO0O;
        oooOO0O.getClass();
        oooOO0O.f9728OooO00o = Collections.emptyList();
        OooO00o oooO00o = this.f9653OooOO0o;
        oooO00o.getClass();
        oooO00o.f9728OooO00o = Collections.emptyList();
        Player player = this.f9699Oooooo;
        ImageView imageView = this.f9666OooOoO;
        if (player != null && player.OooOOo0(30) && this.f9699Oooooo.OooOOo0(29)) {
            androidx.media3.common.o00Oo0 o00oo0OooOO0o = this.f9699Oooooo.OooOO0o();
            o0O00 o0o00OooO0o = OooO0o(o00oo0OooOO0o, 1);
            oooO00o.f9728OooO00o = o0o00OooO0o;
            PlayerControlView playerControlView = PlayerControlView.this;
            Player player2 = playerControlView.f9699Oooooo;
            player2.getClass();
            androidx.media3.common.o00O0O o00o0oOooOo0o = player2.OooOo0o();
            boolean zIsEmpty = o0o00OooO0o.isEmpty();
            OooOO0 oooOO1 = playerControlView.f9645OooO;
            if (zIsEmpty) {
                oooOO1.f9724OooO0O0[1] = playerControlView.getResources().getString(o0000O00.exo_track_selection_none);
            } else if (oooO00o.OooO0Oo(o00o0oOooOo0o)) {
                for (int i = 0; i < o0o00OooO0o.f19062OooO0oO; i++) {
                    OooOOO0 oooOOO0 = (OooOOO0) o0o00OooO0o.get(i);
                    if (oooOOO0.f9730OooO00o.f6862OooO0oo[oooOOO0.f9731OooO0O0]) {
                        oooOO1.f9724OooO0O0[1] = oooOOO0.f9732OooO0OO;
                        break;
                    }
                }
            } else {
                oooOO1.f9724OooO0O0[1] = playerControlView.getResources().getString(o0000O00.exo_track_selection_auto);
            }
            if (this.f9646OooO0Oo.OooO0OO(imageView)) {
                oooOO0O.OooO0Oo(OooO0o(o00oo0OooOO0o, 3));
            } else {
                oooOO0O.OooO0Oo(o0O00.f19060OooO0oo);
            }
        }
        OooOO0O(imageView, oooOO0O.getItemCount() > 0);
        OooOO0 oooOO2 = this.f9645OooO;
        OooOO0O(this.f9669OooOoo, oooOO2.OooO00o(1) || oooOO2.OooO00o(0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return OooO0Oo(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Nullable
    public Player getPlayer() {
        return this.f9699Oooooo;
    }

    public int getRepeatToggleModes() {
        return this.f9710o00ooo;
    }

    public boolean getShowShuffleButton() {
        return this.f9646OooO0Oo.OooO0OO(this.f9661OooOo);
    }

    public boolean getShowSubtitleButton() {
        return this.f9646OooO0Oo.OooO0OO(this.f9666OooOoO);
    }

    public int getShowTimeoutMs() {
        return this.f9706o00Ooo;
    }

    public boolean getShowVrButton() {
        return this.f9646OooO0Oo.OooO0OO(this.f9667OooOoO0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o0O0O00 o0o0o00 = this.f9646OooO0Oo;
        o0o0o00.f9852OooO00o.addOnLayoutChangeListener(o0o0o00.f9870OooOo);
        this.f9711o0OoOo0 = true;
        if (OooO0oo()) {
            o0o0o00.OooO0oO();
        }
        OooOO0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o0O0O00 o0o0o00 = this.f9646OooO0Oo;
        o0o0o00.f9852OooO00o.removeOnLayoutChangeListener(o0o0o00.f9870OooOo);
        this.f9711o0OoOo0 = false;
        removeCallbacks(this.f9680Oooo0o);
        o0o0o00.OooO0o();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f9646OooO0Oo.f9853OooO0O0;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.f9646OooO0Oo.f9878OooOoo = z;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@Nullable OooO0OO oooO0OO) {
        this.f9701OoooooO = oooO0OO;
        boolean z = oooO0OO != null;
        ImageView imageView = this.f9668OooOoOO;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = oooO0OO != null;
        ImageView imageView2 = this.f9670OooOoo0;
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
        p080o000OoO.o00Oo0.OooO0Oo(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.OooOo0O() != Looper.getMainLooper()) {
            z = false;
        }
        p080o000OoO.o00Oo0.OooO00o(z);
        Player player2 = this.f9699Oooooo;
        if (player2 == player) {
            return;
        }
        OooO0O0 oooO0O0 = this.f9647OooO0o;
        if (player2 != null) {
            player2.OooOOOO(oooO0O0);
        }
        this.f9699Oooooo = player;
        if (player != null) {
            player.OooOOoo(oooO0O0);
        }
        OooOO0();
    }

    public void setProgressUpdateListener(@Nullable OooO oooO) {
    }

    public void setRepeatToggleModes(int i) {
        this.f9710o00ooo = i;
        Player player = this.f9699Oooooo;
        if (player != null && player.OooOOo0(15)) {
            int iOoooO0 = this.f9699Oooooo.OoooO0();
            if (i == 0 && iOoooO0 != 0) {
                this.f9699Oooooo.Oooo0oo(0);
            } else if (i == 1 && iOoooO0 == 2) {
                this.f9699Oooooo.Oooo0oo(1);
            } else if (i == 2 && iOoooO0 == 1) {
                this.f9699Oooooo.Oooo0oo(2);
            }
        }
        this.f9646OooO0Oo.OooO0oo(this.f9665OooOo0o, i != 0);
        OooOOOo();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f9646OooO0Oo.OooO0oo(this.f9660OooOOoo, z);
        OooOO0o();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f9716ooOO = z;
        OooOOoo();
    }

    public void setShowNextButton(boolean z) {
        this.f9646OooO0Oo.OooO0oo(this.f9659OooOOo0, z);
        OooOO0o();
    }

    public void setShowPreviousButton(boolean z) {
        this.f9646OooO0Oo.OooO0oo(this.f9657OooOOOo, z);
        OooOO0o();
    }

    public void setShowRewindButton(boolean z) {
        this.f9646OooO0Oo.OooO0oo(this.f9663OooOo00, z);
        OooOO0o();
    }

    public void setShowShuffleButton(boolean z) {
        this.f9646OooO0Oo.OooO0oo(this.f9661OooOo, z);
        OooOOo();
    }

    public void setShowSubtitleButton(boolean z) {
        this.f9646OooO0Oo.OooO0oo(this.f9666OooOoO, z);
    }

    public void setShowTimeoutMs(int i) {
        this.f9706o00Ooo = i;
        if (OooO0oo()) {
            this.f9646OooO0Oo.OooO0oO();
        }
    }

    public void setShowVrButton(boolean z) {
        this.f9646OooO0Oo.OooO0oo(this.f9667OooOoO0, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f9707o00o0O = o00.OooO(i, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.f9667OooOoO0;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            OooOO0O(view, onClickListener != null);
        }
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2) {
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
        int resourceId = o0000Ooo.exo_player_control_view;
        this.f9706o00Ooo = 5000;
        this.f9710o00ooo = 0;
        this.f9707o00o0O = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, o0000O0.PlayerControlView, i, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(o0000O0.PlayerControlView_controller_layout_id, resourceId);
                this.f9706o00Ooo = typedArrayObtainStyledAttributes.getInt(o0000O0.PlayerControlView_show_timeout, this.f9706o00Ooo);
                this.f9710o00ooo = typedArrayObtainStyledAttributes.getInt(o0000O0.PlayerControlView_repeat_toggle_modes, this.f9710o00ooo);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(o0000O0.PlayerControlView_show_rewind_button, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(o0000O0.PlayerControlView_show_fastforward_button, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(o0000O0.PlayerControlView_show_previous_button, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(o0000O0.PlayerControlView_show_next_button, true);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(o0000O0.PlayerControlView_show_shuffle_button, false);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(o0000O0.PlayerControlView_show_subtitle_button, false);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(o0000O0.PlayerControlView_show_vr_button, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(o0000O0.PlayerControlView_time_bar_min_update_interval, this.f9707o00o0O));
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(o0000O0.PlayerControlView_animation_enabled, true);
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
        this.f9647OooO0o = oooO0O0;
        this.f9649OooO0oO = new CopyOnWriteArrayList<>();
        this.f9679Oooo0OO = new androidx.media3.common.Oooo0.OooO0O0();
        this.f9681Oooo0o0 = new androidx.media3.common.Oooo0.OooO0o();
        StringBuilder sb = new StringBuilder();
        this.f9674Oooo0 = sb;
        this.f9678Oooo0O0 = new Formatter(sb, Locale.getDefault());
        this.f9715oo000o = new long[0];
        this.f9709o00oO0o = new boolean[0];
        this.f9708o00oO0O = new long[0];
        this.f9712o0ooOO0 = new boolean[0];
        this.f9680Oooo0o = new androidx.media3.ui.OooOO0O(this, 0);
        this.f9675Oooo000 = (TextView) findViewById(o00000O.exo_duration);
        this.f9676Oooo00O = (TextView) findViewById(o00000O.exo_position);
        ImageView imageView = (ImageView) findViewById(o00000O.exo_subtitle);
        this.f9666OooOoO = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(oooO0O0);
        }
        ImageView imageView2 = (ImageView) findViewById(o00000O.exo_fullscreen);
        this.f9668OooOoOO = imageView2;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: androidx.media3.ui.OooOOO0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerControlView.OooO00o(this.f9637OooO0Oo);
            }
        };
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(onClickListener);
        }
        ImageView imageView3 = (ImageView) findViewById(o00000O.exo_minimal_fullscreen);
        this.f9670OooOoo0 = imageView3;
        androidx.media3.ui.OooOOO oooOOO = new androidx.media3.ui.OooOOO(this, 0);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(oooOOO);
        }
        View viewFindViewById = findViewById(o00000O.exo_settings);
        this.f9669OooOoo = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(oooO0O0);
        }
        View viewFindViewById2 = findViewById(o00000O.exo_playback_speed);
        this.f9671OooOooO = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(oooO0O0);
        }
        View viewFindViewById3 = findViewById(o00000O.exo_audio_track);
        this.f9672OooOooo = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(oooO0O0);
        }
        int i2 = o00000O.exo_progress;
        o000O000 o000o001 = (o000O000) findViewById(i2);
        View viewFindViewById4 = findViewById(o00000O.exo_progress_placeholder);
        if (o000o001 != null) {
            this.f9677Oooo00o = o000o001;
        } else if (viewFindViewById4 != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, o0000oo.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(i2);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f9677Oooo00o = defaultTimeBar;
        } else {
            this.f9677Oooo00o = null;
        }
        o000O000 o000o002 = this.f9677Oooo00o;
        if (o000o002 != null) {
            o000o002.OooO00o(oooO0O0);
        }
        View viewFindViewById5 = findViewById(o00000O.exo_play_pause);
        this.f9658OooOOo = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(oooO0O0);
        }
        View viewFindViewById6 = findViewById(o00000O.exo_prev);
        this.f9657OooOOOo = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(oooO0O0);
        }
        View viewFindViewById7 = findViewById(o00000O.exo_next);
        this.f9659OooOOo0 = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(oooO0O0);
        }
        Typeface typefaceOooO0O0 = androidx.core.content.res.OooO00o.OooO0O0(o00000O0.roboto_medium_numbers, context);
        View viewFindViewById8 = findViewById(o00000O.exo_rew);
        TextView textView = viewFindViewById8 == null ? (TextView) findViewById(o00000O.exo_rew_with_amount) : null;
        this.f9664OooOo0O = textView;
        if (textView != null) {
            textView.setTypeface(typefaceOooO0O0);
        }
        viewFindViewById8 = viewFindViewById8 == null ? textView : viewFindViewById8;
        this.f9663OooOo00 = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setOnClickListener(oooO0O0);
        }
        View viewFindViewById9 = findViewById(o00000O.exo_ffwd);
        TextView textView2 = viewFindViewById9 == null ? (TextView) findViewById(o00000O.exo_ffwd_with_amount) : null;
        this.f9662OooOo0 = textView2;
        if (textView2 != null) {
            textView2.setTypeface(typefaceOooO0O0);
        }
        viewFindViewById9 = viewFindViewById9 == null ? textView2 : viewFindViewById9;
        this.f9660OooOOoo = viewFindViewById9;
        if (viewFindViewById9 != null) {
            viewFindViewById9.setOnClickListener(oooO0O0);
        }
        ImageView imageView4 = (ImageView) findViewById(o00000O.exo_repeat_toggle);
        this.f9665OooOo0o = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(oooO0O0);
        }
        ImageView imageView5 = (ImageView) findViewById(o00000O.exo_shuffle);
        this.f9661OooOo = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(oooO0O0);
        }
        Resources resources = context.getResources();
        this.f9648OooO0o0 = resources;
        this.f9703o000oOoO = resources.getInteger(o00000OO.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f9689OoooOOO = resources.getInteger(o00000OO.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View viewFindViewById10 = findViewById(o00000O.exo_vr);
        this.f9667OooOoO0 = viewFindViewById10;
        if (viewFindViewById10 != null) {
            OooOO0O(viewFindViewById10, false);
        }
        o0O0O00 o0o0o00 = new o0O0O00(this);
        this.f9646OooO0Oo = o0o0o00;
        o0o0o00.f9878OooOoo = z4;
        OooOO0 oooOO1 = new OooOO0(new String[]{resources.getString(o0000O00.exo_controls_playback_speed), resources.getString(o0000O00.exo_track_selection_title_audio)}, new Drawable[]{o00.OooOOo0(context, resources, o00000.exo_styled_controls_speed), o00.OooOOo0(context, resources, o00000.exo_styled_controls_audiotrack)});
        this.f9645OooO = oooOO1;
        this.f9656OooOOOO = resources.getDimensionPixelSize(o000000O.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(o0000Ooo.exo_styled_settings_list, (ViewGroup) null);
        this.f9650OooO0oo = recyclerView;
        recyclerView.setAdapter(oooOO1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f9654OooOOO = popupWindow;
        if (o00.f34910OooO00o < 23) {
            z9 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z9 = false;
        }
        popupWindow.setOnDismissListener(this.f9647OooO0o);
        this.f9714o0ooOoO = true;
        this.f9655OooOOO0 = new androidx.media3.ui.OooO0o(getResources());
        this.f9692OoooOoO = o00.OooOOo0(context, resources, o00000.exo_styled_controls_subtitle_on);
        this.f9693OoooOoo = o00.OooOOo0(context, resources, o00000.exo_styled_controls_subtitle_off);
        this.f9694Ooooo00 = resources.getString(o0000O00.exo_controls_cc_enabled_description);
        this.f9695Ooooo0o = resources.getString(o0000O00.exo_controls_cc_disabled_description);
        this.f9652OooOO0O = new OooOO0O();
        this.f9653OooOO0o = new OooO00o();
        this.f9651OooOO0 = new OooO0o(resources.getStringArray(o000OOo.exo_controls_playback_speeds), f9644o0OOO0o);
        this.f9696OooooO0 = o00.OooOOo0(context, resources, o00000.exo_styled_controls_fullscreen_exit);
        this.f9697OooooOO = o00.OooOOo0(context, resources, o00000.exo_styled_controls_fullscreen_enter);
        this.f9682Oooo0oO = o00.OooOOo0(context, resources, o00000.exo_styled_controls_repeat_off);
        this.f9683Oooo0oo = o00.OooOOo0(context, this.f9648OooO0o0, o00000.exo_styled_controls_repeat_one);
        this.f9673Oooo = o00.OooOOo0(context, this.f9648OooO0o0, o00000.exo_styled_controls_repeat_all);
        this.f9684OoooO = o00.OooOOo0(context, this.f9648OooO0o0, o00000.exo_styled_controls_shuffle_on);
        this.f9688OoooOO0 = o00.OooOOo0(context, this.f9648OooO0o0, o00000.exo_styled_controls_shuffle_off);
        this.f9698OooooOo = this.f9648OooO0o0.getString(o0000O00.exo_controls_fullscreen_exit_description);
        this.f9700Oooooo0 = this.f9648OooO0o0.getString(o0000O00.exo_controls_fullscreen_enter_description);
        this.f9686OoooO00 = this.f9648OooO0o0.getString(o0000O00.exo_controls_repeat_off_description);
        this.f9685OoooO0 = this.f9648OooO0o0.getString(o0000O00.exo_controls_repeat_one_description);
        this.f9687OoooO0O = this.f9648OooO0o0.getString(o0000O00.exo_controls_repeat_all_description);
        this.f9690OoooOOo = this.f9648OooO0o0.getString(o0000O00.exo_controls_shuffle_on_description);
        this.f9691OoooOo0 = this.f9648OooO0o0.getString(o0000O00.exo_controls_shuffle_off_description);
        this.f9646OooO0Oo.OooO0oo((ViewGroup) findViewById(o00000O.exo_bottom_bar), true);
        this.f9646OooO0Oo.OooO0oo(this.f9660OooOOoo, z6);
        this.f9646OooO0Oo.OooO0oo(this.f9663OooOo00, z5);
        this.f9646OooO0Oo.OooO0oo(this.f9657OooOOOo, z7);
        this.f9646OooO0Oo.OooO0oo(this.f9659OooOOo0, z8);
        this.f9646OooO0Oo.OooO0oo(this.f9661OooOo, z2);
        this.f9646OooO0Oo.OooO0oo(this.f9666OooOoO, z3);
        this.f9646OooO0Oo.OooO0oo(this.f9667OooOoO0, z);
        this.f9646OooO0Oo.OooO0oo(this.f9665OooOo0o, this.f9710o00ooo != 0 ? true : z9);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.OooOOOO
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                float[] fArr = PlayerControlView.f9644o0OOO0o;
                PlayerControlView playerControlView = this.f9638OooO0Oo;
                playerControlView.getClass();
                int i11 = i6 - i4;
                int i12 = i10 - i8;
                if (i5 - i3 == i9 - i7 && i11 == i12) {
                    return;
                }
                PopupWindow popupWindow2 = playerControlView.f9654OooOOO;
                if (popupWindow2.isShowing()) {
                    playerControlView.OooOOo0();
                    int width = playerControlView.getWidth() - popupWindow2.getWidth();
                    int i13 = playerControlView.f9656OooOOOO;
                    popupWindow2.update(view, width - i13, (-popupWindow2.getHeight()) - i13, -1, -1);
                }
            }
        });
    }
}
