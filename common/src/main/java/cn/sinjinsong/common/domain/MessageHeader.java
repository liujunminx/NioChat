package cn.sinjinsong.common.domain;

import cn.sinjinsong.common.enumeration.MessageType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MessageHeader {
    private String sender;
    private String receiver;
    private MessageType type;
    private Long timestamp;
}
