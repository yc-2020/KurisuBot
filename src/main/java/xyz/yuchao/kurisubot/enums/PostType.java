package xyz.yuchao.kurisubot.enums;

public enum PostType {
    //消息, 例如, 群聊消息
    message,
    //请求, 例如, 好友申请
    request,
    //通知, 例如, 群成员增加
    notice,
    //元事件, 例如, go-cqhttp 心跳包
    meta_event
}
