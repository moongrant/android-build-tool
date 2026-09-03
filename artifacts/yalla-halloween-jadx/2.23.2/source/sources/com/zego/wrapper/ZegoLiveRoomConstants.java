package com.zego.wrapper;

/* JADX INFO: loaded from: classes4.dex */
public class ZegoLiveRoomConstants {

    public static final class AudioProfile {
        public static final int DEFAULT = 0;
        public static final int MUSIC_HIGH_QUALITY = 4;
        public static final int MUSIC_HIGH_QUALITY_STEREO = 5;
        public static final int MUSIC_STANDARD = 2;
        public static final int MUSIC_STANDARD_STEREO = 3;
        public static final int SPEECH_STANDARD = 1;
    }

    public static final class AudioRecordingQuality {
        public static final int HIGH = 2;
        public static final int LOW = 0;
        public static final int MEDIUM = 1;
    }

    public static final class AudioReverbKey {
        public static final int DAMPING = 5;
        public static final int DRY_LEVEL = 0;
        public static final int ROOM_SIZE = 2;
        public static final int STRENGTH = 4;
        public static final int WET_DELAY = 3;
        public static final int WET_LEVEL = 1;
    }

    public static final class AudioScenario {
        public static final int CHATROOM_ENTERTAINMENT = 1;
        public static final int CHATROOM_GAMING = 5;
        public static final int DEFAULT = 0;
        public static final int EDUCATION = 2;
        public static final int GAME_STREAMING = 3;
        public static final int SHOW_ROOM = 4;
    }

    public static final class CameraDevice {
        public static final int BACK = 0;
        public static final int FRONT = 1;
    }

    public static final class ChannelProfile {
        public static final int COMMUNICATION = 0;
        public static final int LIVE_BROADCASTING = 1;
    }

    public static final class ClientRole {
        public static final int AUDIENCE = 2;
        public static final int BROADCASTER = 1;
    }

    public static final class ConnectionChangedReason {
        public static final int BANNED_BY_SERVER = 3;
        public static final int CONNECTING = 0;
        public static final int INTERRUPTED = 2;
        public static final int JOIN_FAILED = 4;
        public static final int JOIN_SUCCESS = 1;
        public static final int LEAVE_CHANNEL = 5;
    }

    public static final class ConnectionStateType {
        public static final int CONNECTED = 3;
        public static final int CONNECTING = 2;
        public static final int DISCONNECTED = 1;
        public static final int FAILED = 5;
        public static final int RECONNECTING = 4;
    }

    public static final class ErrorCode {
        public static final int FAILED = 1;
        public static final int INVALID_ARGUMENT = 2;
        public static final int INVALID_TOKEN = 110;
        public static final int JOIN_CHANNEL_REJECTED = 17;
        public static final int LEAVE_CHANNEL_REJECTED = 18;
        public static final int NOT_SUPPORTED = 4;
        public static final int SDK_NOT_READY = 3;
        public static final int SDK_SHOULD_NOT_READY = 20001;
        public static final int TIMED_OUT = 10;
    }

    public static final class LocalVideoStreamState {
        public static final int FROZEN = 2;
        public static final int RUNNING = 1;
        public static final int STOPPED = 0;
    }

    public static final class MediaEngineAudioErrorMixing {
        public static final int CODEC = 1003;
        public static final int FILE_NOT_EXIST = 1002;
        public static final int NO_SUPPORT_STREAM = 1004;
        public static final int Next = 1;
        public static final int OK = 0;
        public static final int TYPE_NOT_SUPPORT = 1001;
    }

    public static final class MediaEngineAudioEventMixing {
        public static final int ALL_LOOPS_COMPLETED = 723;
        public static final int ERROR = 714;
        public static final int PAUSED = 711;
        public static final int PLAY = 710;
        public static final int STOPPED = 713;
    }

    public static final class VideoMirrorMode {
        public static final int DISABLED = 2;
        public static final int ENABLED = 1;
    }

    public static final class VideoRemoteState {
        public static final int FROZEN = 2;
        public static final int RUNNING = 1;
        public static final int STOPPED = 0;
    }

    public static final class WarningCode {
        public static final int INVALID_VIEW = 8;
        public static final int MIXING_OPEN_ERROR = 701;
    }

    public static final class ZegoLogFilter {
        public static final int DEBUG = 2;
        public static final int ERROR = 6;
        public static final int INFO = 4;
        public static final int OFF = 0;
        public static final int WRAN = 5;
    }

    public static final class ZegoNetworkQuality {
        public static final int BAD = 2;
        public static final int GOOD = 0;
        public static final int Normal = 1;
        public static final int VBAD = 3;
    }
}
