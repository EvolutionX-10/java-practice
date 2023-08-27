public class Chain {
	public static void main(String[] args) {
		Approver teamLeader = new TeamLeader();
		Approver manager = new Manager();
		Approver accHead = new AccHead();

		teamLeader.setNext(manager);
		manager.setNext(accHead);

		teamLeader.approve(new LeaveRequest(2));
		teamLeader.approve(new LeaveRequest(5));
		teamLeader.approve(new LeaveRequest(8));
		teamLeader.approve(new LeaveRequest(12));
	}
}

class LeaveRequest {
	private int days;

	public LeaveRequest(int days) {
		this.days = days;
	}

	public int getDays() {
		return days;
	}
}

abstract class Approver {
	protected Approver next;

	public void setNext(Approver next) {
		this.next = next;
	}

	public void approve(LeaveRequest request) {
		next.approve(request);
	}
}

class TeamLeader extends Approver {
	public void approve(LeaveRequest request) {
		if (request.getDays() <= 3) {
			System.out.println("TeamLeader approved");
		} else {
			super.approve(request);
		}
	}
}

class Manager extends Approver {
	public void approve(LeaveRequest request) {
		if (request.getDays() <= 7) {
			System.out.println("Manager approved");
		} else {
			super.approve(request);
		}
	}
}

class AccHead extends Approver {
	public void approve(LeaveRequest request) {
		System.out.println("AccHead approved");
	}
}