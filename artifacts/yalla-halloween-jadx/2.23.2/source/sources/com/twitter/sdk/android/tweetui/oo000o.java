package com.twitter.sdk.android.tweetui;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.twitter.sdk.android.tweetui.internal.VideoControlView;
import com.twitter.sdk.android.tweetui.internal.VideoView;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final VideoView f21991OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final VideoControlView f21992OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ProgressBar f21993OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TextView f21994OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f21995OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final View f21996OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f21997OooO0oO = true;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final com.twitter.sdk.android.tweetui.internal.OooO00o.InterfaceC0282OooO00o f21998OooO0oo;

    public oo000o(View view, PlayerActivity.OooO00o oooO00o) {
        this.f21996OooO0o0 = view;
        this.f21991OooO00o = (VideoView) view.findViewById(oo0o0Oo.video_view);
        this.f21992OooO0O0 = (VideoControlView) view.findViewById(oo0o0Oo.video_control_view);
        this.f21993OooO0OO = (ProgressBar) view.findViewById(oo0o0Oo.video_progress_view);
        this.f21994OooO0Oo = (TextView) view.findViewById(oo0o0Oo.call_to_action_view);
        this.f21998OooO0oo = oooO00o;
    }
}
