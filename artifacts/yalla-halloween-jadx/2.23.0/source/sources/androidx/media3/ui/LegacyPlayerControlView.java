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
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p037OoooOo0.o00;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class LegacyPlayerControlView extends FrameLayout {

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f6509OoooOoO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final View f6510OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CopyOnWriteArrayList<OooO0o> f6511OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final View f6512OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final View f6513OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final View f6514OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final View f6515OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final View f6516OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final ImageView f6517OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final ImageView f6518OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public final TextView f6519OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final View f6520OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final TextView f6521OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public final o000O000 f6522OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final Formatter f6523OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final StringBuilder f6524OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final OooO f6525OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f6526OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final Drawable f6527OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final o00 f6528OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final Drawable f6529OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Drawable f6530OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final String f6531OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final String f6532OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Drawable f6533OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final float f6534OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Drawable f6535OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final float f6536OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final String f6537OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f6538Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f6539Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final String f6540Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f6541Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f6542Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f6543Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public int f6544Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f6545Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int f6546Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f6547Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f6548Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public long[] f6549OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f6550OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f6551OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public long f6552OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean[] f6553OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final boolean[] f6554OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public long f6555OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public long f6556OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final long[] f6557o000oOoO;

    @RequiresApi(21)
    public static final class OooO00o {
        @DoNotInline
        public static boolean OooO00o(View view) {
            return view.isAccessibilityFocused();
        }
    }

    public final class OooO0O0 implements o000O000.OooO00o, View.OnClickListener {
        public OooO0O0() {
        }

        @Override // androidx.media3.ui.o000O000.OooO00o
        public final void OooO00o(long j) {
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            legacyPlayerControlView.f6543Oooo0O0 = true;
            TextView textView = legacyPlayerControlView.f6521OooOOOO;
            if (textView != null) {
                textView.setText(o000O000.OooO0o.OooO0Oo(legacyPlayerControlView.f6524OooOOo0, legacyPlayerControlView.f6523OooOOo, j));
            }
        }

        @Override // androidx.media3.ui.o000O000.OooO00o
        public final void OooO0O0(long j) {
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            TextView textView = legacyPlayerControlView.f6521OooOOOO;
            if (textView != null) {
                textView.setText(o000O000.OooO0o.OooO0Oo(legacyPlayerControlView.f6524OooOOo0, legacyPlayerControlView.f6523OooOOo, j));
            }
        }

        @Override // androidx.media3.ui.o000O000.OooO00o
        public final void OooO0OO(long j, boolean z) {
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            legacyPlayerControlView.f6543Oooo0O0 = false;
            if (z) {
                return;
            }
            legacyPlayerControlView.getClass();
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LegacyPlayerControlView.this.getClass();
        }
    }

    public interface OooO0OO {
    }

    public interface OooO0o {
        void OooO00o();
    }

    static {
        p069o0000ooO.o000000O.OooO00o();
    }

    public LegacyPlayerControlView(Context context) {
        this(context, null);
    }

    public final void OooO() {
        ImageView imageView;
        if (OooO0OO() && this.f6541Oooo00O && (imageView = this.f6518OooOO0o) != null) {
            if (!this.f6550OoooO0) {
                OooO0o0(imageView, false, false);
                return;
            }
            String str = this.f6540Oooo000;
            Drawable drawable = this.f6535OooOoo0;
            OooO0o0(imageView, true, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void OooO00o() {
        if (OooO0OO()) {
            setVisibility(8);
            for (OooO0o oooO0o : this.f6511OooO0Oo) {
                getVisibility();
                oooO0o.OooO00o();
            }
            removeCallbacks(this.f6525OooOOoo);
            removeCallbacks(this.f6528OooOo00);
            this.f6552OoooO0O = -9223372036854775807L;
        }
    }

    public final void OooO0O0() {
        o00 o00Var = this.f6528OooOo00;
        removeCallbacks(o00Var);
        if (this.f6544Oooo0OO <= 0) {
            this.f6552OoooO0O = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.f6544Oooo0OO;
        this.f6552OoooO0O = jUptimeMillis + j;
        if (this.f6541Oooo00O) {
            postDelayed(o00Var, j);
        }
    }

    public final boolean OooO0OO() {
        return getVisibility() == 0;
    }

    public final void OooO0Oo() {
        boolean z;
        boolean z2;
        boolean z3;
        if (OooO0OO() && this.f6541Oooo00O) {
            boolean zOooO0oo = o000O000.OooO0o.OooO0oo(null);
            boolean z4 = true;
            View view = this.f6514OooO0oO;
            if (view != null) {
                z = (!zOooO0oo && view.isFocused()) | false;
                if (o000O000.OooO0o.f34423OooO00o < 21) {
                    z3 = z;
                } else {
                    z3 = !zOooO0oo && OooO00o.OooO00o(view);
                }
                z2 = z3 | false;
                view.setVisibility(zOooO0oo ? 0 : 8);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.f6515OooO0oo;
            if (view2 != null) {
                z |= zOooO0oo && view2.isFocused();
                if (o000O000.OooO0o.f34423OooO00o < 21) {
                    z4 = z;
                } else if (!zOooO0oo || !OooO00o.OooO00o(view2)) {
                    z4 = false;
                }
                z2 |= z4;
                view2.setVisibility(zOooO0oo ? 8 : 0);
            }
            if (z) {
                boolean zOooO0oo2 = o000O000.OooO0o.OooO0oo(null);
                if (zOooO0oo2 && view != null) {
                    view.requestFocus();
                } else if (!zOooO0oo2 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z2) {
                boolean zOooO0oo3 = o000O000.OooO0o.OooO0oo(null);
                if (zOooO0oo3 && view != null) {
                    view.sendAccessibilityEvent(8);
                } else if (!zOooO0oo3 && view2 != null) {
                    view2.sendAccessibilityEvent(8);
                }
            }
        }
        OooO0o();
        OooO0oo();
        OooO();
        OooOO0();
    }

    public final void OooO0o() {
        if (OooO0OO() && this.f6541Oooo00O) {
            OooO0o0(this.f6513OooO0o0, this.f6538Oooo, false);
            OooO0o0(this.f6516OooOO0, this.f6547Oooo0oO, false);
            OooO0o0(this.f6510OooO, this.f6548Oooo0oo, false);
            OooO0o0(this.f6512OooO0o, this.f6551OoooO00, false);
            o000O000 o000o001 = this.f6522OooOOOo;
            if (o000o001 != null) {
                o000o001.setEnabled(false);
            }
        }
    }

    public final void OooO0o0(@Nullable View view, boolean z, boolean z2) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.f6534OooOoo : this.f6536OooOooO);
        view.setVisibility(z ? 0 : 8);
    }

    public final void OooO0oO() {
        if (OooO0OO() && this.f6541Oooo00O) {
            boolean z = 0 != this.f6556OoooOo0;
            this.f6556OoooOo0 = 0L;
            TextView textView = this.f6521OooOOOO;
            if (textView != null && !this.f6543Oooo0O0 && z) {
                textView.setText(o000O000.OooO0o.OooO0Oo(this.f6524OooOOo0, this.f6523OooOOo, 0L));
            }
            o000O000 o000o001 = this.f6522OooOOOo;
            if (o000o001 != null) {
                o000o001.setPosition(0L);
                o000o001.setBufferedPosition(0L);
            }
            removeCallbacks(this.f6525OooOOoo);
        }
    }

    public final void OooO0oo() {
        ImageView imageView;
        if (OooO0OO() && this.f6541Oooo00O && (imageView = this.f6517OooOO0O) != null) {
            if (this.f6545Oooo0o == 0) {
                OooO0o0(imageView, false, false);
                return;
            }
            String str = this.f6526OooOo;
            Drawable drawable = this.f6527OooOo0;
            OooO0o0(imageView, true, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void OooOO0() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f6528OooOo00);
        } else if (motionEvent.getAction() == 1) {
            OooO0O0();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public Player getPlayer() {
        return null;
    }

    public int getRepeatToggleModes() {
        return this.f6545Oooo0o;
    }

    public boolean getShowShuffleButton() {
        return this.f6550OoooO0;
    }

    public int getShowTimeoutMs() {
        return this.f6544Oooo0OO;
    }

    public boolean getShowVrButton() {
        View view = this.f6520OooOOO0;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6541Oooo00O = true;
        long j = this.f6552OoooO0O;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                OooO00o();
            } else {
                postDelayed(this.f6528OooOo00, jUptimeMillis);
            }
        } else if (OooO0OO()) {
            OooO0O0();
        }
        OooO0Oo();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6541Oooo00O = false;
        removeCallbacks(this.f6525OooOOoo);
        removeCallbacks(this.f6528OooOo00);
    }

    public void setPlayer(@Nullable Player player) {
        boolean z = true;
        o000O000.OooO00o.OooO0O0(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.OooOO0O() != Looper.getMainLooper()) {
            z = false;
        }
        o000O000.OooO00o.OooO00o(z);
        if (player == null) {
            return;
        }
        if (player != null) {
            player.Oooo0();
        }
        OooO0Oo();
    }

    public void setProgressUpdateListener(@Nullable OooO0OO oooO0OO) {
    }

    public void setRepeatToggleModes(int i) {
        this.f6545Oooo0o = i;
        OooO0oo();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f6548Oooo0oo = z;
        OooO0o();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f6542Oooo00o = z;
        OooOO0();
    }

    public void setShowNextButton(boolean z) {
        this.f6551OoooO00 = z;
        OooO0o();
    }

    public void setShowPreviousButton(boolean z) {
        this.f6538Oooo = z;
        OooO0o();
    }

    public void setShowRewindButton(boolean z) {
        this.f6547Oooo0oO = z;
        OooO0o();
    }

    public void setShowShuffleButton(boolean z) {
        this.f6550OoooO0 = z;
        OooO();
    }

    public void setShowTimeoutMs(int i) {
        this.f6544Oooo0OO = i;
        if (OooO0OO()) {
            OooO0O0();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.f6520OooOOO0;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        int i2 = o000O000.OooO0o.f34423OooO00o;
        this.f6546Oooo0o0 = Math.max(16, Math.min(i, 1000));
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.f6520OooOOO0;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            OooO0o0(view, getShowVrButton(), onClickListener != null);
        }
    }

    public LegacyPlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LegacyPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int resourceId = o00000OO.exo_legacy_player_control_view;
        this.f6544Oooo0OO = 5000;
        this.f6545Oooo0o = 0;
        this.f6546Oooo0o0 = 200;
        this.f6552OoooO0O = -9223372036854775807L;
        this.f6547Oooo0oO = true;
        this.f6548Oooo0oo = true;
        this.f6538Oooo = true;
        this.f6551OoooO00 = true;
        this.f6550OoooO0 = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o0000oo.LegacyPlayerControlView, i, 0);
            try {
                this.f6544Oooo0OO = typedArrayObtainStyledAttributes.getInt(o0000oo.LegacyPlayerControlView_show_timeout, this.f6544Oooo0OO);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(o0000oo.LegacyPlayerControlView_controller_layout_id, resourceId);
                this.f6545Oooo0o = typedArrayObtainStyledAttributes.getInt(o0000oo.LegacyPlayerControlView_repeat_toggle_modes, this.f6545Oooo0o);
                this.f6547Oooo0oO = typedArrayObtainStyledAttributes.getBoolean(o0000oo.LegacyPlayerControlView_show_rewind_button, this.f6547Oooo0oO);
                this.f6548Oooo0oo = typedArrayObtainStyledAttributes.getBoolean(o0000oo.LegacyPlayerControlView_show_fastforward_button, this.f6548Oooo0oo);
                this.f6538Oooo = typedArrayObtainStyledAttributes.getBoolean(o0000oo.LegacyPlayerControlView_show_previous_button, this.f6538Oooo);
                this.f6551OoooO00 = typedArrayObtainStyledAttributes.getBoolean(o0000oo.LegacyPlayerControlView_show_next_button, this.f6551OoooO00);
                this.f6550OoooO0 = typedArrayObtainStyledAttributes.getBoolean(o0000oo.LegacyPlayerControlView_show_shuffle_button, this.f6550OoooO0);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(o0000oo.LegacyPlayerControlView_time_bar_min_update_interval, this.f6546Oooo0o0));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f6511OooO0Oo = new CopyOnWriteArrayList<>();
        new androidx.media3.common.OooO0OO.OooO0O0();
        new androidx.media3.common.OooO0OO.C0139OooO0OO();
        StringBuilder sb = new StringBuilder();
        this.f6524OooOOo0 = sb;
        this.f6523OooOOo = new Formatter(sb, Locale.getDefault());
        this.f6549OoooO = new long[0];
        this.f6553OoooOO0 = new boolean[0];
        this.f6557o000oOoO = new long[0];
        this.f6554OoooOOO = new boolean[0];
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f6525OooOOoo = new OooO(this, 0);
        this.f6528OooOo00 = new o00(this, 1);
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        int i2 = o00000O0.exo_progress;
        o000O000 o000o001 = (o000O000) findViewById(i2);
        View viewFindViewById = findViewById(o00000O0.exo_progress_placeholder);
        if (o000o001 != null) {
            this.f6522OooOOOo = o000o001;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet);
            defaultTimeBar.setId(i2);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f6522OooOOOo = defaultTimeBar;
        } else {
            this.f6522OooOOOo = null;
        }
        this.f6519OooOOO = (TextView) findViewById(o00000O0.exo_duration);
        this.f6521OooOOOO = (TextView) findViewById(o00000O0.exo_position);
        o000O000 o000o002 = this.f6522OooOOOo;
        if (o000o002 != null) {
            o000o002.OooO0O0(oooO0O0);
        }
        View viewFindViewById2 = findViewById(o00000O0.exo_play);
        this.f6514OooO0oO = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(oooO0O0);
        }
        View viewFindViewById3 = findViewById(o00000O0.exo_pause);
        this.f6515OooO0oo = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(oooO0O0);
        }
        View viewFindViewById4 = findViewById(o00000O0.exo_prev);
        this.f6513OooO0o0 = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(oooO0O0);
        }
        View viewFindViewById5 = findViewById(o00000O0.exo_next);
        this.f6512OooO0o = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(oooO0O0);
        }
        View viewFindViewById6 = findViewById(o00000O0.exo_rew);
        this.f6516OooOO0 = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(oooO0O0);
        }
        View viewFindViewById7 = findViewById(o00000O0.exo_ffwd);
        this.f6510OooO = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(oooO0O0);
        }
        ImageView imageView = (ImageView) findViewById(o00000O0.exo_repeat_toggle);
        this.f6517OooOO0O = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(oooO0O0);
        }
        ImageView imageView2 = (ImageView) findViewById(o00000O0.exo_shuffle);
        this.f6518OooOO0o = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(oooO0O0);
        }
        View viewFindViewById8 = findViewById(o00000O0.exo_vr);
        this.f6520OooOOO0 = viewFindViewById8;
        setShowVrButton(false);
        OooO0o0(viewFindViewById8, false, false);
        Resources resources = context.getResources();
        this.f6534OooOoo = resources.getInteger(o00000O.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f6536OooOooO = resources.getInteger(o00000O.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.f6527OooOo0 = o000O000.OooO0o.OooO0OO(context, resources, o000000O.exo_legacy_controls_repeat_off);
        this.f6529OooOo0O = o000O000.OooO0o.OooO0OO(context, resources, o000000O.exo_legacy_controls_repeat_one);
        this.f6530OooOo0o = o000O000.OooO0o.OooO0OO(context, resources, o000000O.exo_legacy_controls_repeat_all);
        this.f6533OooOoOO = o000O000.OooO0o.OooO0OO(context, resources, o000000O.exo_legacy_controls_shuffle_on);
        this.f6535OooOoo0 = o000O000.OooO0o.OooO0OO(context, resources, o000000O.exo_legacy_controls_shuffle_off);
        this.f6526OooOo = resources.getString(o0000.exo_controls_repeat_off_description);
        this.f6532OooOoO0 = resources.getString(o0000.exo_controls_repeat_one_description);
        this.f6531OooOoO = resources.getString(o0000.exo_controls_repeat_all_description);
        this.f6537OooOooo = resources.getString(o0000.exo_controls_shuffle_on_description);
        this.f6540Oooo000 = resources.getString(o0000.exo_controls_shuffle_off_description);
        this.f6556OoooOo0 = -9223372036854775807L;
    }
}
