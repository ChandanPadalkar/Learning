import { MessageService } from './message.service';
describe('MessageService', () => {
    let service: MessageService;

    beforeEach(() => {
        service = new MessageService();
    })

    it('should start with no messages', () => {
        expect(service.messages.length).toBe(0);
    })

    describe('add', () => {

        it('should add new message', () => {
            service.add('message1');

            expect(service.messages.length).toBe(1);
        })
    })

    describe('clear', () => {
        it('should clear all messages', () => {

            service.clear();
            expect(service.messages.length).toBe(0);
        })
    })
})