package com.twitter.sdk.android.tweetui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.twitter.sdk.android.tweetui.OooO0O0;
import com.twitter.sdk.android.tweetui.internal.VideoControlView;
import com.twitter.sdk.android.tweetui.internal.VideoView;
import java.util.Objects;
import p418o0Oo0oo.oo000o;
import p439o0OoOOo0.o00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final VideoView f20121OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final VideoControlView f20122OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ProgressBar f20123OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TextView f20124OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f20125OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final View f20126OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f20127OooO0oO = true;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final com.twitter.sdk.android.tweetui.internal.OooO00o.InterfaceC0183OooO00o f20128OooO0oo;

    public OooO0O0(View view, com.twitter.sdk.android.tweetui.internal.OooO00o.InterfaceC0183OooO00o interfaceC0183OooO00o) {
        this.f20126OooO0o0 = view;
        this.f20121OooO00o = (VideoView) view.findViewById(o00.video_view);
        this.f20122OooO0O0 = (VideoControlView) view.findViewById(o00.video_control_view);
        this.f20123OooO0OO = (ProgressBar) view.findViewById(o00.video_progress_view);
        this.f20124OooO0Oo = (TextView) view.findViewById(o00.call_to_action_view);
        this.f20128OooO0oo = interfaceC0183OooO00o;
    }

    public final void OooO00o(PlayerActivity.PlayerItem playerItem) {
        if (playerItem.f20135OoooO00 == null || playerItem.f20131Oooo == null) {
            return;
        }
        this.f20124OooO0Oo.setVisibility(0);
        this.f20124OooO0Oo.setText(playerItem.f20135OoooO00);
        final String str = playerItem.f20131Oooo;
        this.f20124OooO0Oo.setOnClickListener(new View.OnClickListener() { // from class: o0OoOOo0.o000O0Oo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OooO0O0 oooO0O0 = this.f40143Oooo0o;
                String str2 = str;
                Objects.requireNonNull(oooO0O0);
                oo000o.OooO0OO(oooO0O0.f20124OooO0Oo.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(str2)));
            }
        });
        this.f20126OooO0o0.setOnClickListener(new View.OnClickListener() { // from class: o0OoOOo0.o000O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OooO0O0 oooO0O0 = this.f40140Oooo0o;
                if (oooO0O0.f20124OooO0Oo.getVisibility() == 0) {
                    oooO0O0.f20124OooO0Oo.setVisibility(8);
                } else {
                    oooO0O0.f20124OooO0Oo.setVisibility(0);
                }
            }
        });
    }
}
